package it.gruppofanta.championshiprace.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.converters.impl.AbstractPopulatingConverter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

import it.gruppofanta.championship.model.GranPrixModel;
import it.gruppofanta.championship.model.PlacingModel;
import it.gruppofanta.championshiprace.data.GranPrixData;
import it.gruppofanta.championshiprace.data.PlacingData;


public class DefaultGranPrixPopulator implements Populator<GranPrixModel, GranPrixData>
{
	private AbstractPopulatingConverter<PlacingModel, PlacingData> placingConverter;

	@Override
	public void populate(final GranPrixModel source, final GranPrixData target) throws ConversionException
	{
		target.setCode(source.getCode());
		target.setName(source.getName());
		target.setLaps(source.getLaps());
		target.setNation(source.getNation());
		target.setDate(source.getDate());
		final List<PlacingData> placingList = new ArrayList<PlacingData>();
		for (final PlacingModel placingModel : source.getPlacings())
		{
			placingList.add(placingConverter.convert(placingModel));
		}
		target.setPlacing(placingList);
	}

	@Required
	public void setPlacingConverter(final AbstractPopulatingConverter<PlacingModel, PlacingData> placingConverter)
	{
		this.placingConverter = placingConverter;
	}

}
