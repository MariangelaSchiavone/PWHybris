package it.gruppofanta.championshipfrontend.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.gruppofanta.championshipfrontend.NameEncoded;
import it.gruppofanta.championshiprace.data.RaceChampionshipData;
import it.gruppofanta.championshiprace.facades.RaceChampionshipFacade;


@Controller
public class RaceChampionshipController
{
	private RaceChampionshipFacade raceChampionshipFacade;

	@RequestMapping(value = "/raceChampionships")
	public String showRaceChampionships(final Model model)
	{
		final List<RaceChampionshipData> raceChampionships = raceChampionshipFacade.getRaceChampionships();
		model.addAttribute("raceChampionships", raceChampionships);
		return "RaceChampionships";
	}

	@RequestMapping(value = "/raceChampionships/{championshipDetails}")
	public String showRaceChampionshipDetails(@PathVariable final String championshipDetails, final Model model)
			throws UnsupportedEncodingException
	{
		//		championshipDetails = URLDecoder.decode(championshipDetails, "UTF-8");
		//		final GranPrixData raceChampionship = granPrixFacade.getGranPrix(championshipDetails);
		//		//
		//		raceChampionship.setName(NameEncoded.getNameEncoded(raceChampionship.getName()));
		//		model.addAttribute("raceChampionship", raceChampionship);
		return "RaceChampionshipDetails";
	}

	//TODO
	@RequestMapping(value = "/raceChampionships/{gpDetails}")
	public String showGranPrixDetails(@PathVariable String gpDetails, final Model model) throws UnsupportedEncodingException
	{
		gpDetails = URLDecoder.decode(gpDetails, "UTF-8");
		final RaceChampionshipData raceChampionship = raceChampionshipFacade.getRaceChampionship(gpDetails);
		raceChampionship.setName(NameEncoded.getNameEncoded(raceChampionship.getName()));
		model.addAttribute("raceChampionship", raceChampionship);
		return "championshipType";
	}

	@Autowired
	public void setRaceChampionshipFacade(final RaceChampionshipFacade raceChampionshipFacade)
	{
		this.raceChampionshipFacade = raceChampionshipFacade;
	}

}