package it.gruppofanta.championshipfrontend.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import it.gruppofanta.championshiprace.data.DriverData;
import it.gruppofanta.championshiprace.data.StableData;
import it.gruppofanta.championshiprace.facades.DriverFacade;
import it.gruppofanta.championshiprace.facades.StableFacade;


@Controller
public class StableController
{

	@Autowired
	private StableFacade stableFacade;

	@Autowired
	private DriverFacade driverFacade;

	@RequestMapping(value = "/stables/{stableDetails}")
	public String showStableDetails(@PathVariable String stableDetails, final Model model) throws UnsupportedEncodingException
	{
		stableDetails = URLDecoder.decode(stableDetails, "UTF-8");
		final StableData stableData = stableFacade.getStableForCode(stableDetails);
		final DriverData driver1Data = driverFacade.getDriverForVehicle(stableData.getFirstVehicle().getCode());
		final DriverData driver2Data = driverFacade.getDriverForVehicle(stableData.getSecondVehicle().getCode());
		model.addAttribute("stable", stableData);
		model.addAttribute("driver1", driver1Data);
		model.addAttribute("driver2", driver2Data);
		return "StableDetails";
	}
}
