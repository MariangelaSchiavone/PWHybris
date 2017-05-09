package it.gruppofanta.championshiprace.facades;

import it.gruppofanta.championshiprace.data.DriverData;


public interface DriverFacade
{

	DriverData getDriverForCode(String code);

	DriverData getDriverForVehicle(String vehicle);

}
