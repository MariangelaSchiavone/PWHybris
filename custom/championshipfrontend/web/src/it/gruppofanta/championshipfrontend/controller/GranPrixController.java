package it.gruppofanta.championshipfrontend.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.gruppofanta.championshiprace.data.GranPrixData;
import it.gruppofanta.championshiprace.facades.GranPrixFacade;


@Controller
public class GranPrixController
{

	@Autowired
	private GranPrixFacade gpFacade;

	@RequestMapping(value = "/raceChampionships/granPrix/{gpDetails}")
	public String showGranPrixDetails(@PathVariable String gpDetails, final Model model) throws UnsupportedEncodingException
	{
		gpDetails = URLDecoder.decode(gpDetails, "UTF-8");
		final GranPrixData gpData = gpFacade.getGranPrix(gpDetails);
		model.addAttribute("granPrix", gpData);
		return "GranPrixDetails";
	}
}
