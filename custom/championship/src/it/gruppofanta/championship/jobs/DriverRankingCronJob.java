package it.gruppofanta.championship.jobs;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;

import it.gruppofanta.championship.model.DriverEntryModel;
import it.gruppofanta.championship.model.DriverRankingModel;
import it.gruppofanta.championship.model.GranPrixModel;
import it.gruppofanta.championship.model.PlacingModel;


public class DriverRankingCronJob extends AbstractJobPerformable<CronJobModel>
{

	private static final Logger LOG = Logger.getLogger(DriverRankingCronJob.class);

	@Override
	public PerformResult perform(final CronJobModel arg0)
	{
		LOG.info("Updating driver ranking");
		final String queryString = "SELECT {" + GranPrixModel.PK + "} FROM {" + GranPrixModel._TYPECODE + "} ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		final List<GranPrixModel> granPrixList = flexibleSearchService.<GranPrixModel> search(query).getResult();
		if (CollectionUtils.isEmpty(granPrixList))
		{
			LOG.info("No gran prix");
			return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
		}
		Date endTime = new Date(System.currentTimeMillis());
		boolean firstTime = true;
		if (arg0.getEndTime() != null)
		{
			endTime = arg0.getEndTime();
			firstTime = false;
		}
		for (final GranPrixModel granPrixModel : granPrixList)
		{
			DriverRankingModel driverRankingModel = granPrixModel.getRaceChampionship().getDriverRanking();
			final String typeRace = granPrixModel.getRaceChampionship().getType().toString();
			//TODO firstTime è true ogni volta che parte in cronjob
			//driverRankingModel è null anche se non dovrebbe
			if (firstTime || driverRankingModel == null)
			{
				driverRankingModel = modelService.create(DriverRankingModel.class);
				final List<DriverEntryModel> driverEntries = new LinkedList<DriverEntryModel>();
				driverRankingModel.setDriversEntry(driverEntries);
				driverRankingModel.setCode(typeRace);
				granPrixModel.getRaceChampionship().setDriverRanking(driverRankingModel);
				modelService.save(driverRankingModel);
				firstTime = false;
			}
			if (!granPrixModel.getDate().before(endTime))
			{
				final Collection<PlacingModel> placings = granPrixModel.getPlacings();
				if (CollectionUtils.isEmpty(placings))
				{
					LOG.info("No placings");
					return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
				}
				for (final PlacingModel placingModel : placings)
				{
					switch (placingModel.getPosition().intValue())
					{
						case 1:
							addPoints(driverRankingModel, granPrixModel, placingModel, 10);
							break;
						case 2:
							addPoints(driverRankingModel, granPrixModel, placingModel, 8);
							break;
						case 3:
							addPoints(driverRankingModel, granPrixModel, placingModel, 6);
							break;
						case 4:
							addPoints(driverRankingModel, granPrixModel, placingModel, 4);
							break;
						case 5:
							addPoints(driverRankingModel, granPrixModel, placingModel, 2);
							break;
						default:
							addPoints(driverRankingModel, granPrixModel, placingModel, 0);
							break;
					}
				}
			}
		}
		LOG.info("non funzionerà mai");
		return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
	}

	private void addPoints(final DriverRankingModel driverRankingModel, final GranPrixModel granPrixModel,
			final PlacingModel placingModel, final int points)
	{
		final List<DriverEntryModel> driverEntries = driverRankingModel.getDriversEntry();
		if (driverEntries.size() >= 10)
		{
			for (final DriverEntryModel driverEntryModel : driverEntries)
			{
				if (driverEntryModel.getDriver().getCode().equals(placingModel.getDriver().getCode()))
				{
					driverEntryModel.setPoints(Integer.valueOf(driverEntryModel.getPoints().intValue() + points));
					break;
				}
			}
		}
		else
		{
			final DriverEntryModel driverEntryModel = modelService.create(DriverEntryModel.class);
			driverEntryModel.setDriver(placingModel.getDriver());
			driverEntryModel.setPoints(Integer.valueOf(points));
			driverEntryModel.setPosition(placingModel.getPosition());
			driverEntryModel.setCode(placingModel.getCode());
			driverEntryModel.setDriverRanking(driverRankingModel);
			//TODO trovare un altro modo per aggiungere i model alla lista
			//driverEntries.add(driverEntryModel);
			modelService.save(driverEntryModel);
		}
	}
}
