package it.gruppofanta.championship.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.gruppofanta.championship.daos.RaceChampionshipDao;
import it.gruppofanta.championship.model.RaceChampionshipModel;


@Component(value = "raceChampionshipDAO")
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

}
