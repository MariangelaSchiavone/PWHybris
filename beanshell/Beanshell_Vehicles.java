import de.hybris.platform.core.Registry;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.servicelayer.model.ModelService;

import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import it.gruppofanta.championship.model.VehicleModel;
import it.gruppofanta.championshiprace.data.VehicleData;

import java.util.Comparator;
import java.util.Collection;
import java.util.List;

import org.springframework.context.ApplicationContext;

// IMPORT RECIPEMODEL OBJECT


	// BODY

		try {
			// RETRIEVE SERVICES FROM CONTEXT
			ApplicationContext ctx = Registry.getApplicationContext();
			FlexibleSearchService flexibleSearchService = (FlexibleSearchService) ctx.getBean("flexibleSearchService");
			ModelService modelService = (ModelService) ctx.getBean("modelService");
			AbstractPopulatingConverter vehicleConverter = (AbstractPopulatingConverter) ctx.getBean("vehicleConverter");
			
			// EXTRACTS ALL THE RECIPES CONTAINING THE FOOD PRODUCT WITH CODE 12341234
			final String query = "select {v.pk} from {Vehicle as v} where {v.code} = '1'";

			final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(query);
			
			// EXECUTE QUERY
			List resultList = flexibleSearchService.search(fQuery).getResult();
            System.out.println(resultList.size() + " Vehicle found");

			int counter = 0;
			VehicleModel vehicleModel;
			for (Object vehicle : resultList) {
				
					vehicleModel = (VehicleModel) vehicle;
					System.out.println(vehicleModel.getCode());
					counter++;
					
			}
			System.out.println("Finished iterating over " + counter + " recipes");
			
			VehicleData vehicleData = vehicleConverter.convert(vehicleModel);

			System.out.println(vehicleData.getName());
			System.out.println(vehicleData.getNumber());
			System.out.println(vehicleData.getType());

		} catch (Exception e) {
			e.printStackTrace();
		}
