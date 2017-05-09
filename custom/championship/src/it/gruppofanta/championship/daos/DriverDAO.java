package it.gruppofanta.championship.daos;

import java.util.List;

import it.gruppofanta.championship.model.DriverModel;


public interface DriverDAO
{

	List<DriverModel> findDriversByCode(String code);

	List<DriverModel> findDriversByVehicle(String vehicle);
}