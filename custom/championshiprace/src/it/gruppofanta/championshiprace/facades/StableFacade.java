package it.gruppofanta.championshiprace.facades;

import it.gruppofanta.championshiprace.data.StableData;


public interface StableFacade
{
	StableData getStableForCode(String code);

	StableData getStableForVehicle(String vehicle);
}
