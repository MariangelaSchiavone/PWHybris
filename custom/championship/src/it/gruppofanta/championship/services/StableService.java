package it.gruppofanta.championship.services;

import java.util.List;

import it.gruppofanta.championship.model.StableModel;
import it.gruppofanta.championship.model.VehicleModel;


public interface StableService
{

	List<StableModel> getStables();

	StableModel getStablesForCode(String code);

	StableModel getStablesForVehicle(VehicleModel vehicle);

}