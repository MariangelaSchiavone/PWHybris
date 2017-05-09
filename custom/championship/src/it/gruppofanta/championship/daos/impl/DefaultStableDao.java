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
	public List<StableModel> findStablesByCode(final String code)
	{
		final String queryString = "SELECT {p:" + StableModel.PK + "} FROM {" + StableModel._TYPECODE + " AS p} "//
				+ "WHERE " + "{p:" + StableModel.CODE + "}=?code ";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);
		return flexibleSearchService.<StableModel> search(query).getResult();
	}

	@Override
	public List<StableModel> findStablesByVehicle(final String vehicle)
	{
		String queryString = "SELECT {p:" + VehicleModel.PK + "} FROM {" + VehicleModel._TYPECODE + " AS v} "//
				+ "WHERE " + "{p:" + VehicleModel.CODE + "}=?vehicle";
		FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("vehicle", vehicle);
		final VehicleModel vehicleModel = flexibleSearchService.<VehicleModel> search(query).getResult().get(0);
		queryString = "SELECT DISTINCT {p:" + StableModel.PK + "} FROM {" + StableModel._TYPECODE + " AS p}" + "WHERE " + "{p:"
				+ StableModel.FIRSTVEHICLE + "}=?first OR {p:" + StableModel.SECONDVEHICLE + "}=?second";
		query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("first", vehicleModel.getPk());
		query.addQueryParameter("second", vehicleModel.getPk());
		return flexibleSearchService.<StableModel> search(query).getResult();
	}

}
