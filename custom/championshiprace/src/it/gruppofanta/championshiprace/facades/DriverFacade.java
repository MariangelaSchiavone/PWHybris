package it.gruppofanta.championshiprace.facades;

import it.gruppofanta.championshiprace.data.DriverData;
import it.gruppofanta.championshiprace.data.VehicleData;

public interface DriverFacade
{

	DriverData getDriver(String name);

	DriverData getDriver(VehicleData vehicle);

}
