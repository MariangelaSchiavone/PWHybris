package it.gruppofanta.championship.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import java.util.Calendar;
import java.util.Date;

import it.gruppofanta.championship.model.GranPrixModel;


public class AssignDateGrandPrixInterceptor implements PrepareInterceptor<GranPrixModel>
{

	@Override
	public void onPrepare(final GranPrixModel granPrixModel, final InterceptorContext arg1) throws InterceptorException
	{
		final Date date = granPrixModel.getDate();
		final Calendar newDate = Calendar.getInstance();
		newDate.setTime(date);
		newDate.add(Calendar.DATE, -1);
		granPrixModel.setDate(newDate.getTime());
	}
}
