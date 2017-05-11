/**
 *
 */
package it.gruppofanta.championshiprace.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.model.StableEntryModel;
import it.gruppofanta.championship.model.StableModel;
import it.gruppofanta.championshiprace.data.StableData;
import it.gruppofanta.championshiprace.data.StableEntryData;


/**
 * @author soprasteria
 *
 */
public class DefaultStableEntryPopulator implements Populator<StableEntryModel, StableEntryData>
{

	private AbstractPopulatingConverter<StableModel, StableData> stableConverter;

	@Override
	public void populate(final StableEntryModel source, final StableEntryData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setPosition(source.getPosition());
		target.setPoints(source.getPoints());
		target.setStable(stableConverter.convert(source.getStable()));
	}

	@Required
	public void setStableConverter(final AbstractPopulatingConverter<StableModel, StableData> stableConverter)
	{
		this.stableConverter = stableConverter;
	}



}
