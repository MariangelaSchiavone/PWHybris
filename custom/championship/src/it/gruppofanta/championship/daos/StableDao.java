package it.gruppofanta.championship.daos;

import java.util.List;

import it.gruppofanta.championship.model.StableModel;
import it.gruppofanta.championship.model.VehicleModel;


public interface StableDao
{
	List<StableModel> findStables();

	List<StableModel> findStablesByCode(String code);

	List<StableModel> findStablesByVehicle(VehicleModel vehicle);
}
