package it.gruppofanta.championshipfrontend.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.gruppofanta.championshiprace.data.GranPrixData;
import it.gruppofanta.championshiprace.data.RaceChampionshipData;
import it.gruppofanta.championshiprace.facades.DriverFacade;
import it.gruppofanta.championshiprace.facades.GranPrixFacade;
import it.gruppofanta.championshiprace.facades.RaceChampionshipFacade;
import it.gruppofanta.championshiprace.facades.StableFacade;


@Controller
public class RaceChampionshipController
{
	private RaceChampionshipFacade raceChampionshipFacade;
	private StableFacade stableFacade;
	private DriverFacade driverFacade;
	private GranPrixFacade grandPrixFacade;



	@RequestMapping(value = "/raceChampionships")
	public String showRaceChampionships(final Model model)
	{
		final List<RaceChampionshipData> raceChampionships = raceChampionshipFacade.getRaceChampionships();
		model.addAttribute("raceChampionships", raceChampionships);
		return "championship";
	}

	//stadiums=raceChampionships
	//stadium=raceChampionship
	//stadiumName=raceChampionshipType

	@RequestMapping(value = "/raceChampionships/{raceChampionshipType}")
	public String showChampionshipDetails(@PathVariable String raceChampionshipType, final Model model)
			throws UnsupportedEncodingException
	{
		raceChampionshipType = URLDecoder.decode(raceChampionshipType, "UTF-8");
		final RaceChampionshipData raceChampionship = raceChampionshipFacade.getRaceChampionship(raceChampionshipType);
		//todo
		//raceChampionship.setName(raceChampionshipsNameEncoded.getNameEncoded(raceChampionship.getName()));
		model.addAttribute("raceChampionship", raceChampionship);
		return "championshipType";
	}

	//da completare
	@RequestMapping(value = "/raceChampionships/{raceChampionshipType}/{gpDetails}")
	public String showGrandPrixDetails(@PathVariable final String raceChampionshipType, @PathVariable String gpDetails,
			final Model model) throws UnsupportedEncodingException
	{
		gpDetails = URLDecoder.decode(gpDetails, "UTF-8");
		final GranPrixData raceChampionship = grandPrixFacade.getGranPrix(gpDetails);
		//
		raceChampionship.setName(raceChampionshipsNameEncoded.getNameEncoded(raceChampionship.getName()));
		model.addAttribute("raceChampionship", raceChampionship);
		return "championshipType";
	}

	//da completare
	@RequestMapping(value = "/raceChampionships/{raceChampionshipType}/{gpDetails}")
	public String showGranPrixDetails(@PathVariable final String raceChampionshipType, @PathVariable String gpDetails,
			final Model model) throws UnsupportedEncodingException
	{
		gpDetails = URLDecoder.decode(gpDetails, "UTF-8");
		final RaceChampionshipData raceChampionship = granPrixFacade.getRaceChampionship(gpDetails);
		raceChampionship.setName(raceChampionshipsNameEncoded.getNameEncoded(raceChampionship.getName()));
		model.addAttribute("raceChampionship", raceChampionship);
		return "championshipType";
	}

	@Autowired
	public void setFacade(final RaceChampionshipFacade facade, final StableFacade stableFacade, final DriverFacade driverFacade,
			final GranPrixFacade grandPrixFacade)
	{
		this.raceChampionshipFacade = facade;
		this.stableFacade = stableFacade;
		this.driverFacade = driverFacade;
		this.grandPrixFacade = grandPrixFacade;

	}

}