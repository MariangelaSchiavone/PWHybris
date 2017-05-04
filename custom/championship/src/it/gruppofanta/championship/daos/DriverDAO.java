package it.gruppofanta.championship.daos;

import java.util.List;

import it.gruppofanta.championship.model.DriverModel;
import it.gruppofanta.championship.model.VehicleModel;


public interface DriverDAO
{

	List<DriverModel> findDriversByCode(String code);

	List<DriverModel> findDriversByVehicle(VehicleModel vehicle);
}