package it.gruppofanta.championshiprace.facades.impl;

import de.hybris.platform.converters.impl.AbstractPopulatingConverter;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.model.StableModel;
import it.gruppofanta.championship.services.StableService;
import it.gruppofanta.championshiprace.data.StableData;
import it.gruppofanta.championshiprace.facades.StableFacade;


public class DefaultStableFacade implements StableFacade
{

	private StableService stableService;

	private AbstractPopulatingConverter<StableModel, StableData> stableConverter;

	@Override
	public StableData getStableForCode(final String code)
	{
		StableModel stable = null;
		if (code != null)
		{
			stable = stableService.getStablesForCode(code);
			if (stable == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("Stable with name " + code + " not found.");
		}
		return stableConverter.convert(stable);
	}

	@Override
	public StableData getStableForVehicle(final String vehicle)
	{

		StableModel stable = null;
		if (vehicle != null)
		{
			stable = stableService.getStablesForVehicle(vehicle);
			if (stable == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("Stable with vehicle " + vehicle + " not found.");
		}

		return stableConverter.convert(stable);
	}

	@Required
	public void setStableService(final StableService stableService)
	{
		this.stableService = stableService;
	}

	@Required
	public void setStableConverter(final AbstractPopulatingConverter<StableModel, StableData> stableConverter)
	{
		this.stableConverter = stableConverter;
	}


}
