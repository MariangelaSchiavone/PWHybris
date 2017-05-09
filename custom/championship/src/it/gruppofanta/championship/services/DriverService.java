package it.gruppofanta.championship.services;


import it.gruppofanta.championship.model.DriverModel;


public interface DriverService
{

	DriverModel getDriversForCode(String code);

	DriverModel getDriversForVehicle(String vehicle);

}
