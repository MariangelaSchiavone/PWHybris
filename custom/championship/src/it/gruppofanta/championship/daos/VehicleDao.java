/**
 *
 */
package it.gruppofanta.championship.daos;

import java.util.List;

import it.gruppofanta.championship.model.VehicleModel;


public interface VehicleDao
{
	List<VehicleModel> findVehicles();

	List<VehicleModel> findVehiclesByCode(String code);
}
