package it.gruppofanta.championshiprace.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.model.DriverRankingModel;
import it.gruppofanta.championship.model.GranPrixModel;
import it.gruppofanta.championship.model.RaceChampionshipModel;
import it.gruppofanta.championship.model.StableRankingModel;
import it.gruppofanta.championshiprace.data.DriverRankingData;
import it.gruppofanta.championshiprace.data.GranPrixData;
import it.gruppofanta.championshiprace.data.RaceChampionshipData;
import it.gruppofanta.championshiprace.data.StableRankingData;


public class DefaultRaceChampionshipPopulator implements Populator<RaceChampionshipModel, RaceChampionshipData>
{
	private AbstractPopulatingConverter<StableRankingModel, StableRankingData> stableRankingConverter;
	private AbstractPopulatingConverter<DriverRankingModel, DriverRankingData> driverRankingConverter;
	private AbstractPopulatingConverter<GranPrixModel, GranPrixData> granPrixConverter;

	@Override
	public void populate(final RaceChampionshipModel source, final RaceChampionshipData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setName(source.getName());
		target.setType(source.getType().toString());
		if (source.getDriverRanking() != null && source.getStableRanking() != null)
		{
			target.setDriverRanking(driverRankingConverter.convert(source.getDriverRanking()));
			target.setStableRanking(stableRankingConverter.convert(source.getStableRanking()));
		}
		final List<GranPrixData> granPrixList = new ArrayList<GranPrixData>();
		for (final GranPrixModel granPrix : source.getGranPrix())
		{
			granPrixList.add(granPrixConverter.convert(granPrix));
		}
		target.setGranPrix(granPrixList);
	}

	@Required
	public void setStableRankingConverter(
			final AbstractPopulatingConverter<StableRankingModel, StableRankingData> stableRankingConverter)
	{
		this.stableRankingConverter = stableRankingConverter;
	}

	@Required
	public void setDriverRankingConverter(
			final AbstractPopulatingConverter<DriverRankingModel, DriverRankingData> driverRankingConverter)
	{
		this.driverRankingConverter = driverRankingConverter;
	}

	@Required
	public void setGranPrixConverter(final AbstractPopulatingConverter<GranPrixModel, GranPrixData> granPrixConverter)
	{
		this.granPrixConverter = granPrixConverter;
	}


}
