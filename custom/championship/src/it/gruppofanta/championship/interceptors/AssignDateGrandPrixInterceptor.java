package it.gruppofanta.championship.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

import it.gruppofanta.championship.model.GranPrixModel;


public class AssignDateGrandPrixInterceptor implements PrepareInterceptor<GranPrixModel>
{
	static final private Logger LOG = Logger.getLogger(AssignDateGrandPrixInterceptor.class);

	@Override
	public void onPrepare(final GranPrixModel granPrixModel, final InterceptorContext arg1) throws InterceptorException
	{
		final Date date = granPrixModel.getDate();
		LOG.info(date);
		final Calendar newDate = Calendar.getInstance();
		LOG.info(newDate);
		newDate.setTime(date);
		newDate.add(Calendar.DATE, -1);
		LOG.info(newDate);
		LOG.info(newDate.getTime());
		granPrixModel.setDate(newDate.getTime());
	}
}
