package it.gruppofanta.championshiprace.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.model.DriverModel;
import it.gruppofanta.championship.model.VehicleModel;
import it.gruppofanta.championshiprace.data.DriverData;
import it.gruppofanta.championshiprace.data.VehicleData;


public class DefaultDriverPopulator implements Populator<DriverModel, DriverData>
{

	private AbstractPopulatingConverter<VehicleModel, VehicleData> vehicleConverter;

	@Override
	public void populate(final DriverModel source, final DriverData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setName(source.getName());
		target.setSurname(source.getSurname());
		target.setNationality(source.getNationality());
		target.setVehicle(vehicleConverter.convert(source.getVehicle()));
	}

	@Required
	public void setVehicleConverter(final AbstractPopulatingConverter<VehicleModel, VehicleData> vehicleConverter)
	{
		this.vehicleConverter = vehicleConverter;
	}


}
