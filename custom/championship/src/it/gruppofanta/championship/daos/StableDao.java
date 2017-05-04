package it.gruppofanta.championship.daos;

import java.util.List;

import it.gruppofanta.championship.model.StableModel;


public interface StableDao
{
	List<StableModel> findStables();

	List<StableModel> findStablesByCode(String code);
}
