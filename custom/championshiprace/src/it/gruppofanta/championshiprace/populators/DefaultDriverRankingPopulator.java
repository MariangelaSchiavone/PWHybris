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

import it.gruppofanta.championship.model.DriverEntryModel;
import it.gruppofanta.championship.model.DriverRankingModel;
import it.gruppofanta.championshiprace.data.DriverEntryData;
import it.gruppofanta.championshiprace.data.DriverRankingData;


/**
 * @author soprasteria
 *
 */
public class DefaultDriverRankingPopulator implements Populator<DriverRankingModel, DriverRankingData>
{

	private AbstractPopulatingConverter<DriverEntryModel, DriverEntryData> driverEntryConverter;

	@Override
	public void populate(final DriverRankingModel source, final DriverRankingData target) throws ConversionException
	{
		target.setCode(source.getCode());
		final List<DriverEntryData> driverEntryList = new ArrayList<DriverEntryData>();
		for (final DriverEntryModel driverEntry : source.getDriversEntry())
		{
			driverEntryList.add(driverEntryConverter.convert(driverEntry));
		}
		target.setPlacing(driverEntryList);
	}

	@Required
	public void setDriverEntryConverter(final AbstractPopulatingConverter<DriverEntryModel, DriverEntryData> driverEntryConverter)
	{
		this.driverEntryConverter = driverEntryConverter;
	}

}
