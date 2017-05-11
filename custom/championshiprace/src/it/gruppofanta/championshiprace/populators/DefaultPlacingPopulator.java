package it.gruppofanta.championshiprace.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.model.DriverModel;
import it.gruppofanta.championship.model.PlacingModel;
import it.gruppofanta.championshiprace.data.DriverData;
import it.gruppofanta.championshiprace.data.PlacingData;


public class DefaultPlacingPopulator implements Populator<PlacingModel, PlacingData>
{

	private AbstractPopulatingConverter<DriverModel, DriverData> driverConverter;

	@Override
	public void populate(final PlacingModel source, final PlacingData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setPosition(source.getPosition());
		target.setTime(source.getTime());
		target.setDriver(driverConverter.convert(source.getDriver()));
	}

	@Required
	public void setDriverConverter(final AbstractPopulatingConverter<DriverModel, DriverData> driverConverter)
	{
		this.driverConverter = driverConverter;
	}

}
