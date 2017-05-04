package it.gruppofanta.championship.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.gruppofanta.championship.daos.DriverDAO;
import it.gruppofanta.championship.model.DriverModel;
import it.gruppofanta.championship.model.VehicleModel;


@Component(value = "driverDAO")
public class DefaultDriverDAO implements DriverDAO
{

	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<DriverModel> findDriversByCode(final String code)
	{
		final String queryString = //
				"SELECT {p:" + DriverModel.PK + "}" //
						+ "FROM {" + DriverModel._TYPECODE + " AS p} "//
						+ "WHERE " + "{p:" + DriverModel.CODE + "}=?code ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);

		return flexibleSearchService.<DriverModel> search(query).getResult();
	}

	@Override
	public List<DriverModel> findDriversByVehicle(final VehicleModel vehicle)
	{
		final String queryString = "SELECT {p:" + DriverModel.PK + "} FROM {" + DriverModel._TYPECODE + " AS p}, {"
				+ VehicleModel._TYPECODE + " AS v} "//
				+ "WHERE " + "{p:" + DriverModel.VEHICLE + "}=?vehicle";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("vehicle", vehicle.getPk());
		return flexibleSearchService.<DriverModel> search(query).getResult();
	}
}