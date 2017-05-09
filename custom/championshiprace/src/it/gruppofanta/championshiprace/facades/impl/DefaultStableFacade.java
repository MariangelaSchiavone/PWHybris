package it.gruppofanta.championshiprace.facades.impl;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.model.StableModel;
import it.gruppofanta.championship.model.VehicleModel;
import it.gruppofanta.championship.services.StableService;
import it.gruppofanta.championshiprace.data.StableData;
import it.gruppofanta.championshiprace.data.VehicleData;
import it.gruppofanta.championshiprace.facades.StableFacade;


public class DefaultStableFacade implements StableFacade
{

	private StableService stableService;

	@Override
	public StableData getStableForCode(final String code)
	{
		StableModel stable = null;
		if (code != null)
		{
			stable = stableService.getStablesForCode(code);
			if (stable == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("Stable with name " + code + " not found.");
		}

		final StableData stableData = new StableData();
		stableData.setCode(stable.getCode());
		stableData.setName(stable.getName());
		stableData.setNation(stable.getNation());
		stableData.setFirstVehicle(getVehicleData(stable.getFirstVehicle()));
		stableData.setSecondVehicle(getVehicleData(stable.getFirstVehicle()));
		return stableData;
	}

	@Override
	public StableData getStableForVehicle(final String vehicle)
	{

		StableModel stable = null;
		if (vehicle != null)
		{
			stable = stableService.getStablesForVehicle(vehicle);
			if (stable == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("Stable with vehicle " + vehicle + " not found.");
		}

		final StableData stableData = new StableData();
		stableData.setCode(stable.getCode());
		stableData.setName(stable.getName());
		stableData.setNation(stable.getNation());
		stableData.setFirstVehicle(getVehicleData(stable.getFirstVehicle()));
		stableData.setSecondVehicle(getVehicleData(stable.getFirstVehicle()));
		return stableData;
	}

	private VehicleData getVehicleData(final VehicleModel vehicleM)
	{
		final VehicleData vehicle = new VehicleData();
		vehicle.setCode(vehicleM.getCode());
		vehicle.setName(vehicleM.getName());
		vehicle.setNumber(vehicleM.getNumber());
		vehicle.setType(vehicleM.getType().toString());
		return vehicle;
	}

	@Required
	public void setStableService(final StableService stableService)
	{
		this.stableService = stableService;
	}

}
