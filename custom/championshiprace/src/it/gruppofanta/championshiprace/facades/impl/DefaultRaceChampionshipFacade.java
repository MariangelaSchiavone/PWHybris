package it.gruppofanta.championshiprace.facades.impl;

import de.hybris.platform.converters.impl.AbstractPopulatingConverter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.model.RaceChampionshipModel;
import it.gruppofanta.championship.services.RaceChampionshipService;
import it.gruppofanta.championshiprace.data.RaceChampionshipData;
import it.gruppofanta.championshiprace.facades.RaceChampionshipFacade;


public class DefaultRaceChampionshipFacade implements RaceChampionshipFacade
{

	private RaceChampionshipService raceChampionshipService;

	private AbstractPopulatingConverter<RaceChampionshipModel, RaceChampionshipData> raceChampionshipConverter;

	@Override
	public RaceChampionshipData getRaceChampionship(final String name)
	{
		RaceChampionshipModel rcm = null;
		if (name != null)
		{
			rcm = raceChampionshipService.getRaceChampionshipsForCode(name);
			if (rcm == null)
			{
				return null;
			}
			return raceChampionshipConverter.convert(rcm);
		}
		else
		{
			throw new IllegalArgumentException("RaceChampionship with name " + name + " not found.");
		}
	}


	@Override
	public List<RaceChampionshipData> getRaceChampionships()
	{
		final List<RaceChampionshipModel> raceChampionshipModels = raceChampionshipService.getRaceChampionships();
		final List<RaceChampionshipData> raceChampionshipList = new ArrayList<RaceChampionshipData>();
		for (final RaceChampionshipModel rcm : raceChampionshipModels)
		{
			raceChampionshipList.add(raceChampionshipConverter.convert(rcm));
		}
		return raceChampionshipList;
	}

	@Required
	public void setRaceChampionshipService(final RaceChampionshipService raceChampionshipService)
	{
		this.raceChampionshipService = raceChampionshipService;
	}


	@Required
	public void setRaceChampionshipConverter(
			final AbstractPopulatingConverter<RaceChampionshipModel, RaceChampionshipData> raceChampionshipConverter)
	{
		this.raceChampionshipConverter = raceChampionshipConverter;
	}

}
