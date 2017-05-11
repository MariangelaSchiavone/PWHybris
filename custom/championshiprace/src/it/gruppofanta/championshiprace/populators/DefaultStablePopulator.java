package it.gruppofanta.championshiprace.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.model.StableModel;
import it.gruppofanta.championship.model.VehicleModel;
import it.gruppofanta.championshiprace.data.StableData;
import it.gruppofanta.championshiprace.data.VehicleData;


public class DefaultStablePopulator implements Populator<StableModel, StableData>
{

	private AbstractPopulatingConverter<VehicleModel, VehicleData> vehicleConverter;

	@Override
	public void populate(final StableModel source, final StableData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setName(source.getName());
		target.setNation(source.getNation());
		target.setFirstVehicle(vehicleConverter.convert(source.getFirstVehicle()));
		target.setSecondVehicle(vehicleConverter.convert(source.getSecondVehicle()));
	}

	@Required
	public void setVehicleConverter(final AbstractPopulatingConverter<VehicleModel, VehicleData> vehicleConverter)
	{
		this.vehicleConverter = vehicleConverter;
	}

}
