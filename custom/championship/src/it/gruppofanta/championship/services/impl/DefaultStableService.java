package it.gruppofanta.championship.services.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.daos.StableDao;
import it.gruppofanta.championship.model.StableModel;
import it.gruppofanta.championship.services.StableService;


public class DefaultStableService implements StableService
{
	private StableDao stableDAO;

	@Override
	public StableModel getStablesForCode(final String code) throws AmbiguousIdentifierException, UnknownIdentifierException
	{
		final List<StableModel> result = stableDAO.findStablesByCode(code);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Race Championship with code '" + code + "' not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException(
					"Race Championship code '" + code + "' is not unique, " + result.size() + " Race Championships found!");
		}
		return result.get(0);
	}

	@Override
	public StableModel getStablesForVehicle(final String vehicle) throws AmbiguousIdentifierException, UnknownIdentifierException
	{
		final List<StableModel> result = stableDAO.findStablesByVehicle(vehicle);
		if (result.isEmpty())
		{
			throw new UnknownIdentifierException("Stable with vehicle '" + vehicle + "' not found!");
		}
		else if (result.size() > 1)
		{
			throw new AmbiguousIdentifierException(
					"Stable vehicle '" + vehicle + "' is not unique, " + result.size() + " stables found!");
		}
		return result.get(0);
	}

	@Required
	public void setStableDAO(final StableDao stableDAO)
	{
		this.stableDAO = stableDAO;
	}
}