package it.gruppofanta.championship.services.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.daos.GranPrixDAO;
import it.gruppofanta.championship.model.GranPrixModel;
import it.gruppofanta.championship.services.GranPrixService;


public class DefaultGranPrixService implements GranPrixService
{
	private GranPrixDAO granPrixDAO;

	@Override
	public GranPrixModel getGranPrixForCode(final String code) throws AmbiguousIdentifierException, UnknownIdentifierException
	{
		final List<GranPrixModel> result = granPrixDAO.findGranPrixByCode(code);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Gran Prix with code '" + code + "' not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException(
					"Gran Prix code '" + code + "' is not unique, " + result.size() + " Gran Prix found!");
		}
		return result.get(0);
	}

	@Required
	public void setGranPrixDAO(final GranPrixDAO granPrixDAO)
	{
		this.granPrixDAO = granPrixDAO;
	}
}
