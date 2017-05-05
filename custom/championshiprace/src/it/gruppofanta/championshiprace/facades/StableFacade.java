package it.gruppofanta.championshiprace.facades;

import it.gruppofanta.championshiprace.data.StableData;
import it.gruppofanta.championshiprace.data.VehicleData;

public interface StableFacade
{
	StableData getStable(String name);

	StableData getStable(VehicleData vehicle);
}
