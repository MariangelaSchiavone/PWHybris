/**
 *
 */
package it.gruppofanta.championship.daos;

import java.util.List;

import it.gruppofanta.championship.model.GranPrixModel;


public interface GranPrixDAO
{

	List<GranPrixModel> findGranPrix();


	List<GranPrixModel> findGranPrixByCode(String code);
}