package it.gruppofanta.championship.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.gruppofanta.championship.daos.PlacingDAO;
import it.gruppofanta.championship.model.PlacingModel;


@Component(value = "PlacingDAO")
public class DefaultPlacingDAO implements PlacingDAO
{

	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<PlacingModel> findPlacings()
	{

		final String queryString = //
				"SELECT {p:" + PlacingModel.PK + "} "//
						+ "FROM {" + PlacingModel._TYPECODE + " AS p} ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		return flexibleSearchService.<PlacingModel> search(query).getResult();
	}


	@Override
	public List<PlacingModel> findPlacingsByCode(final String code)
	{
		final String queryString = //
				"SELECT {p:" + PlacingModel.PK + "}" //
						+ "FROM {" + PlacingModel._TYPECODE + " AS p} "//
						+ "WHERE " + "{p:" + PlacingModel.CODE + "}=?code ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);

		return flexibleSearchService.<PlacingModel> search(query).getResult();
	}

}
