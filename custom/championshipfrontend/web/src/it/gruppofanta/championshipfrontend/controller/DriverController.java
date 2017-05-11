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
public class DriverController
{

	@Autowired
	private DriverFacade driverFacade;

	@Autowired
	private StableFacade stableFacade;

	@RequestMapping(value = "/drivers/{driver}")
	public String showGranPrixDetails(@PathVariable String driver, final Model model) throws UnsupportedEncodingException
	{
		driver = URLDecoder.decode(driver, "UTF-8");
		final DriverData driverData = driverFacade.getDriverForCode(driver);
		final StableData stableData = stableFacade.getStableForVehicle(driverData.getVehicle().getCode());
		model.addAttribute("driver", driverData);
		model.addAttribute("stable", stableData);
		return "DriverDetails";
	}

}
