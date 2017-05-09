package it.gruppofanta.championship.services;

import it.gruppofanta.championship.model.StableModel;


public interface StableService
{

	StableModel getStablesForCode(String code);

	StableModel getStablesForVehicle(String vehicle);

}