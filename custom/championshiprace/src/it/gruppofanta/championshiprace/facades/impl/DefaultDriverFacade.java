package it.gruppofanta.championshiprace.facades.impl;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.model.DriverModel;
import it.gruppofanta.championship.services.DriverService;
import it.gruppofanta.championshiprace.data.DriverData;
import it.gruppofanta.championshiprace.facades.DriverFacade;


public class DefaultDriverFacade implements DriverFacade
{

	private DriverService driverService;

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

		final DriverData driverData = new DriverData();
		driverData.setCode(driver.getCode());
		driverData.setName(driver.getName());
		driverData.setSurname(driver.getSurname());
		driverData.setNationality(driver.getNationality());
		return driverData;
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

		final DriverData driverData = new DriverData();
		driverData.setCode(driver.getCode());
		driverData.setName(driver.getName());
		driverData.setSurname(driver.getSurname());
		driverData.setNationality(driver.getNationality());
		return driverData;
	}

	@Required
	public void setDriverService(final DriverService driverService)
	{
		this.driverService = driverService;
	}
}
