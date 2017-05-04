package it.gruppofanta.championship.daos.impl;

import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.gruppofanta.championship.daos.RaceChampionshipDao;
import it.gruppofanta.championship.model.GranPrixModel;
import it.gruppofanta.championship.model.RaceChampionshipModel;


@Component(value = "RaceChampionshipDAO")
public class DefaultRaceChampionshipDao implements RaceChampionshipDao
{

	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<RaceChampionshipModel> findRaceChampionships()
	{
		final String queryString = "SELECT {p:" + RaceChampionshipModel.PK + "} FROM {" + RaceChampionshipModel._TYPECODE
				+ " AS p} ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		return flexibleSearchService.<RaceChampionshipModel> search(query).getResult();

	}

	@Override
	public List<RaceChampionshipModel> findRaceChampionshipsByCode(final String code)
	{
		final String queryString = "SELECT {p:" + RaceChampionshipModel.PK + "} FROM {" + RaceChampionshipModel._TYPECODE
				+ " AS p} "//
				+ "WHERE " + "{p:" + RaceChampionshipModel.CODE + "}=?code ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		return flexibleSearchService.<RaceChampionshipModel> search(query).getResult();
	}

	@Override
	public List<String> retrieveGranPrixCalendar(final String code)
	{
		final List<RaceChampionshipModel> raceChampionships = findRaceChampionshipsByCode(code);
		if (raceChampionships.isEmpty())
		{
			throw new UnknownIdentifierException("RaceChampionship with code '" + code + "' not found!");
		}
		else if (raceChampionships.size() > 1)
		{
			throw new AmbiguousIdentifierException(
					"RaceChampionship code '" + code + "' is not unique, " + raceChampionships.size() + " stadiums found!");
		}
		final RaceChampionshipModel result = raceChampionships.get(0);
		final List<String> toReturn = new LinkedList<String>();
		final Collection<GranPrixModel> granPrix = result.getGranPrix();
		for (final GranPrixModel granPrixModel : granPrix)
		{
			toReturn.add(granPrixModel.getDate());
		}
		return toReturn;
	}

}
