package it.gruppofanta.championshiprace.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.model.DriverEntryModel;
import it.gruppofanta.championship.model.DriverModel;
import it.gruppofanta.championshiprace.data.DriverData;
import it.gruppofanta.championshiprace.data.DriverEntryData;


public class DefaultDriverEntryPopulator implements Populator<DriverEntryModel, DriverEntryData>
{

	private AbstractPopulatingConverter<DriverModel, DriverData> driverConverter;

	@Override
	public void populate(final DriverEntryModel source, final DriverEntryData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setPosition(source.getPosition());
		target.setPoints(source.getPoints());
		target.setDriver(driverConverter.convert(source.getDriver()));
	}

	@Required
	public void setDriverConverter(final AbstractPopulatingConverter<DriverModel, DriverData> driverConverter)
	{
		this.driverConverter = driverConverter;
	}



}
