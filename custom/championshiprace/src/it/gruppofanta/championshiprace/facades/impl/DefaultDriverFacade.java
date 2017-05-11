package it.gruppofanta.championshiprace.facades.impl;

import de.hybris.platform.converters.impl.AbstractPopulatingConverter;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.model.DriverModel;
import it.gruppofanta.championship.services.DriverService;
import it.gruppofanta.championshiprace.data.DriverData;
import it.gruppofanta.championshiprace.facades.DriverFacade;


public class DefaultDriverFacade implements DriverFacade
{

	private DriverService driverService;

	private AbstractPopulatingConverter<DriverModel, DriverData> driverConverter;

	@Override
	public DriverData getDriverForCode(final String code)
	{
		DriverModel driver = null;
		if (code != null)
		{
			driver = driverService.getDriversForCode(code);
			if (driver == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("Driver with name " + code + " not found.");
		}
		return driverConverter.convert(driver);
	}


	@Override
	public DriverData getDriverForVehicle(final String vehicle)
	{
		DriverModel driver = null;
		if (vehicle != null)
		{
			driver = driverService.getDriversForVehicle(vehicle);
			if (driver == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("Stable with vehicle " + vehicle + " not found.");
		}
		return driverConverter.convert(driver);
	}

	@Required
	public void setDriverService(final DriverService driverService)
	{
		this.driverService = driverService;
	}

	@Required
	public void setDriverConverter(final AbstractPopulatingConverter<DriverModel, DriverData> driverConverter)
	{
		this.driverConverter = driverConverter;
	}


}
