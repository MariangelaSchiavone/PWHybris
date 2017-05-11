package it.gruppofanta.championshiprace.facades.impl;

import de.hybris.platform.converters.impl.AbstractPopulatingConverter;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.model.GranPrixModel;
import it.gruppofanta.championship.services.GranPrixService;
import it.gruppofanta.championshiprace.data.GranPrixData;
import it.gruppofanta.championshiprace.facades.GranPrixFacade;


public class DefaultGranPrixFacade implements GranPrixFacade
{

	private GranPrixService granPrixService;

	private AbstractPopulatingConverter<GranPrixModel, GranPrixData> granPrixConverter;

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
		return granPrixConverter.convert(granPrix);
	}

	@Required
	public void setGranPrixService(final GranPrixService granPrixService)
	{
		this.granPrixService = granPrixService;
	}

	@Required
	public void setGranPrixConverter(final AbstractPopulatingConverter<GranPrixModel, GranPrixData> granPrixConverter)
	{
		this.granPrixConverter = granPrixConverter;
	}

}
