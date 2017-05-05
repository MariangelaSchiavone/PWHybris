package it.gruppofanta.championshiprace.facades;

import java.util.List;

import it.gruppofanta.championshiprace.data.RaceChampionshipData;


public interface RaceChampionshipFacade
{
	RaceChampionshipData getRaceChampionship(String name);

	List<RaceChampionshipData> getRaceChampionships();

}
