package it.gruppofanta.championship.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.gruppofanta.championship.daos.StableDao;
import it.gruppofanta.championship.model.StableModel;
import it.gruppofanta.championship.model.VehicleModel;


@Component(value = "stableDAO")
public class DefaultStableDao implements StableDao
{
	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<StableModel> findStables()
	{
		final String queryString = "SELECT {p:" + StableModel.PK + "} FROM {" + StableModel._TYPECODE + " AS p} ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		return flexibleSearchService.<StableModel> search(query).getResult();
	}

	@Override
	public List<StableModel> findStablesByCode(final String code)
	{
		final String queryString = "SELECT {p:" + StableModel.PK + "} FROM {" + StableModel._TYPECODE + " AS p} "//
				+ "WHERE " + "{p:" + StableModel.CODE + "}=?code ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		return flexibleSearchService.<StableModel> search(query).getResult();
	}

	@Override
	public List<StableModel> findStablesByVehicle(final VehicleModel vehicle)
	{
		final String queryString = "SELECT DISTINCT {p:" + StableModel.PK + "} FROM {" + StableModel._TYPECODE + " AS p}, {"
				+ VehicleModel._TYPECODE + " AS v} "//
				+ "WHERE " + "{p:" + StableModel.FIRSTVEHICLE + "}=?first OR {p:" + StableModel.SECONDVEHICLE + "}=?second";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("first", vehicle.getPk());
		query.addQueryParameter("second", vehicle.getPk());
		return flexibleSearchService.<StableModel> search(query).getResult();
	}

}
