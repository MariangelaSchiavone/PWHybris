package it.gruppofanta.championshiprace.facades.impl;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.model.GranPrixModel;
import it.gruppofanta.championship.services.GranPrixService;
import it.gruppofanta.championshiprace.data.GranPrixData;
import it.gruppofanta.championshiprace.facades.GranPrixFacade;


public class DefaultGranPrixFacade implements GranPrixFacade
{

	private GranPrixService granPrixService;

	@Override
	public GranPrixData getGranPrix(final String name)
	{
		GranPrixModel granPrix = null;
		if (name != null)
		{
			granPrix = granPrixService.getGranPrixForCode(name);
			if (granPrix == null)
			{
				return null;
			}
		}
		else
		{
			throw new IllegalArgumentException("GranPrix with name " + name + " not found.");
		}

		final GranPrixData granPrixData = new GranPrixData();
		granPrixData.setCode(granPrix.getCode());
		granPrixData.setName(granPrix.getName());
		granPrixData.setLaps(granPrix.getLaps());
		granPrixData.setNation(granPrix.getNation());
		granPrixData.setDate(granPrix.getDate());
		return granPrixData;
	}

	@Required
	public void setGranPrixService(final GranPrixService granPrixService)
	{
		this.granPrixService = granPrixService;
	}


}
