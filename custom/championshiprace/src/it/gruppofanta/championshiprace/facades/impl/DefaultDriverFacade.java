package it.gruppofanta.championshiprace.facades.impl;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.model.DriverModel;
import it.gruppofanta.championship.services.DriverService;
import it.gruppofanta.championshiprace.data.DriverData;
import it.gruppofanta.championshiprace.data.VehicleData;
import it.gruppofanta.championshiprace.facades.DriverFacade;


public class DefaultDriverFacade implements DriverFacade
{

	private DriverService driverService;

	@Override
	public DriverData getDriver(final String name)
	{
		DriverModel driver = null;
		if (name != null)
		{
			driver = driverService.getDriversForCode(name);
			if (driver == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("Driver with name " + name + " not found.");
		}

		final DriverData driverData = new DriverData();
		driverData.setName(driver.getName());
		driverData.setSurname(driver.getSurname());
		driverData.setNationality(driver.getNationality());
		return driverData;
	}


	@Override
	public DriverData getDriver(final VehicleData vehicle)
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
			throw new IllegalArgumentException("Stable with vehicle " + vehicle.getName() + " not found.");
		}

		final DriverData driverData = new DriverData();
		driverData.setName(driver.getName());
		driverData.setSurname(driver.getSurname());
		driverData.setNationality(driver.getNationality());
		return driverData;
		return null;
	}

	@Required
	public void setDriverService(final DriverService driverService)
	{
		this.driverService = driverService;
	}
}
