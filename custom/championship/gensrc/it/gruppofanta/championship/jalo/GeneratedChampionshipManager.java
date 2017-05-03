/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 4-mag-2017 0.12.19                          ---
 * ----------------------------------------------------------------
 */
package it.gruppofanta.championship.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import it.gruppofanta.championship.constants.ChampionshipConstants;
import it.gruppofanta.championship.jalo.Driver;
import it.gruppofanta.championship.jalo.GranPrix;
import it.gruppofanta.championship.jalo.Placing;
import it.gruppofanta.championship.jalo.RaceChampionship;
import it.gruppofanta.championship.jalo.Stable;
import it.gruppofanta.championship.jalo.Vehicle;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>ChampionshipManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedChampionshipManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public Driver createDriver(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ChampionshipConstants.TC.DRIVER );
			return (Driver)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Driver : "+e.getMessage(), 0 );
		}
	}
	
	public Driver createDriver(final Map attributeValues)
	{
		return createDriver( getSession().getSessionContext(), attributeValues );
	}
	
	public GranPrix createGranPrix(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ChampionshipConstants.TC.GRANPRIX );
			return (GranPrix)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating GranPrix : "+e.getMessage(), 0 );
		}
	}
	
	public GranPrix createGranPrix(final Map attributeValues)
	{
		return createGranPrix( getSession().getSessionContext(), attributeValues );
	}
	
	public Placing createPlacing(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ChampionshipConstants.TC.PLACING );
			return (Placing)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Placing : "+e.getMessage(), 0 );
		}
	}
	
	public Placing createPlacing(final Map attributeValues)
	{
		return createPlacing( getSession().getSessionContext(), attributeValues );
	}
	
	public RaceChampionship createRaceChampionship(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ChampionshipConstants.TC.RACECHAMPIONSHIP );
			return (RaceChampionship)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating RaceChampionship : "+e.getMessage(), 0 );
		}
	}
	
	public RaceChampionship createRaceChampionship(final Map attributeValues)
	{
		return createRaceChampionship( getSession().getSessionContext(), attributeValues );
	}
	
	public Stable createStable(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ChampionshipConstants.TC.STABLE );
			return (Stable)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Stable : "+e.getMessage(), 0 );
		}
	}
	
	public Stable createStable(final Map attributeValues)
	{
		return createStable( getSession().getSessionContext(), attributeValues );
	}
	
	public Vehicle createVehicle(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ChampionshipConstants.TC.VEHICLE );
			return (Vehicle)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Vehicle : "+e.getMessage(), 0 );
		}
	}
	
	public Vehicle createVehicle(final Map attributeValues)
	{
		return createVehicle( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return ChampionshipConstants.EXTENSIONNAME;
	}
	
}
