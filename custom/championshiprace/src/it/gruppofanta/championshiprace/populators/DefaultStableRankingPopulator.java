/**
 *
 */
package it.gruppofanta.championshiprace.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.model.StableEntryModel;
import it.gruppofanta.championship.model.StableRankingModel;
import it.gruppofanta.championshiprace.data.StableEntryData;
import it.gruppofanta.championshiprace.data.StableRankingData;


public class DefaultStableRankingPopulator implements Populator<StableRankingModel, StableRankingData>
{

	private AbstractPopulatingConverter<StableEntryModel, StableEntryData> stableEntryConverter;

	@Override
	public void populate(final StableRankingModel source, final StableRankingData target) throws ConversionException
	{
		target.setCode(source.getCode());
		final List<StableEntryData> stableRankingList = new ArrayList<StableEntryData>();
		for (final StableEntryModel stableRanking : source.getStablesEntry())
		{
			stableRankingList.add(stableEntryConverter.convert(stableRanking));
		}
		target.setPlacing(stableRankingList);
	}

	@Required
	public void setStableEntryConverter(final AbstractPopulatingConverter<StableEntryModel, StableEntryData> stableEntryConverter)
	{
		this.stableEntryConverter = stableEntryConverter;
	}

}
