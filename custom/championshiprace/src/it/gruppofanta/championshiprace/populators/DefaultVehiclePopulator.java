package it.gruppofanta.championshiprace.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import it.gruppofanta.championship.model.VehicleModel;
import it.gruppofanta.championshiprace.data.VehicleData;


public class DefaultVehiclePopulator implements Populator<VehicleModel, VehicleData>
{

	@Override
	public void populate(final VehicleModel source, final VehicleData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setName(source.getName());
		target.setNumber(source.getNumber());
		target.setType(source.getType().toString());
	}

}
