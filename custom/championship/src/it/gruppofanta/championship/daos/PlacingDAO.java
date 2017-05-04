/**
 *
 */
/**
 *
 */
package it.gruppofanta.championship.daos;

import java.util.List;

import it.gruppofanta.championship.model.PlacingModel;


public interface PlacingDAO
{

	List<PlacingModel> findPlacings();


	List<PlacingModel> findPlacingsByCode(String code);
}