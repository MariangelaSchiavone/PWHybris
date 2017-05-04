/**
 *
 */
package it.gruppofanta.championship.daos.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.gruppofanta.championship.daos.VehicleDao;
import it.gruppofanta.championship.model.VehicleModel;


@Component(value = "vehicleDAO")
public class DefaultVehicleDao implements VehicleDao
{

	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<VehicleModel> findVehicles()
	{
		final String queryString = //
				"SELECT {v:" + VehicleModel.PK + "} "//
						+ "FROM {" + VehicleModel._TYPECODE + " AS v} ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		// Return the list of StadiumModels.
		return flexibleSearchService.<VehicleModel> search(query).getResult();
	}

	@Override
	public List<VehicleModel> findVehiclesByCode(final String code)
	{
		final String queryString = //
				"SELECT {v:" + VehicleModel.PK + "}" //
						+ "FROM {" + VehicleModel._TYPECODE + " AS v} "//
						+ "WHERE " + "{v:" + VehicleModel.CODE + "}=?code ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		query.addQueryParameter("code", code);

		return flexibleSearchService.<VehicleModel> search(query).getResult();
	}

}
