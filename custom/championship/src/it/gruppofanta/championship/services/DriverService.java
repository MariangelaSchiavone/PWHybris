package it.gruppofanta.championship.services;


import it.gruppofanta.championship.model.DriverModel;
import it.gruppofanta.championship.model.VehicleModel;


public interface DriverService
{

	DriverModel getDriversForCode(String code);

	DriverModel getDriversForVehicle(VehicleModel vehicle);

}
