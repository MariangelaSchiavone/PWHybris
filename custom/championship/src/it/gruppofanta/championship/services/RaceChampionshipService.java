package it.gruppofanta.championshiprace.services;

import java.util.List;

import it.gruppofanta.championship.model.RaceChampionshipModel;


public interface RaceChampionshipService
{

	List<RaceChampionshipModel> getRaceChampionships();

	RaceChampionshipModel getRaceChampionshipsForCode(String code);

}