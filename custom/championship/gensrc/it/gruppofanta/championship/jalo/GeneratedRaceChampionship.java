/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 12-mag-2017 16.42.18                        ---
 * ----------------------------------------------------------------
 */
package it.gruppofanta.championship.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import it.gruppofanta.championship.constants.ChampionshipConstants;
import it.gruppofanta.championship.jalo.Driver;
import it.gruppofanta.championship.jalo.DriverRanking;
import it.gruppofanta.championship.jalo.GranPrix;
import it.gruppofanta.championship.jalo.StableRanking;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem RaceChampionship}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRaceChampionship extends GenericItem
{
	/** Qualifier of the <code>RaceChampionship.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>RaceChampionship.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>RaceChampionship.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>RaceChampionship.stableRanking</code> attribute **/
	public static final String STABLERANKING = "stableRanking";
	/** Qualifier of the <code>RaceChampionship.driverRanking</code> attribute **/
	public static final String DRIVERRANKING = "driverRanking";
	/** Qualifier of the <code>RaceChampionship.granPrix</code> attribute **/
	public static final String GRANPRIX = "granPrix";
	/** Qualifier of the <code>RaceChampionship.drivers</code> attribute **/
	public static final String DRIVERS = "drivers";
	/**
	* {@link OneToManyHandler} for handling 1:n GRANPRIX's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<GranPrix> GRANPRIXHANDLER = new OneToManyHandler<GranPrix>(
	ChampionshipConstants.TC.GRANPRIX,
	false,
	"raceChampionship",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n DRIVERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Driver> DRIVERSHANDLER = new OneToManyHandler<Driver>(
	ChampionshipConstants.TC.DRIVER,
	false,
	"raceChampionship",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(STABLERANKING, AttributeMode.INITIAL);
		tmp.put(DRIVERRANKING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RaceChampionship.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RaceChampionship.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RaceChampionship.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RaceChampionship.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RaceChampionship.driverRanking</code> attribute.
	 * @return the driverRanking - Driver Ranking
	 */
	public DriverRanking getDriverRanking(final SessionContext ctx)
	{
		return (DriverRanking)getProperty( ctx, DRIVERRANKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RaceChampionship.driverRanking</code> attribute.
	 * @return the driverRanking - Driver Ranking
	 */
	public DriverRanking getDriverRanking()
	{
		return getDriverRanking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RaceChampionship.driverRanking</code> attribute. 
	 * @param value the driverRanking - Driver Ranking
	 */
	public void setDriverRanking(final SessionContext ctx, final DriverRanking value)
	{
		setProperty(ctx, DRIVERRANKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RaceChampionship.driverRanking</code> attribute. 
	 * @param value the driverRanking - Driver Ranking
	 */
	public void setDriverRanking(final DriverRanking value)
	{
		setDriverRanking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RaceChampionship.drivers</code> attribute.
	 * @return the drivers
	 */
	public Collection<Driver> getDrivers(final SessionContext ctx)
	{
		return DRIVERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RaceChampionship.drivers</code> attribute.
	 * @return the drivers
	 */
	public Collection<Driver> getDrivers()
	{
		return getDrivers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RaceChampionship.drivers</code> attribute. 
	 * @param value the drivers
	 */
	public void setDrivers(final SessionContext ctx, final Collection<Driver> value)
	{
		DRIVERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RaceChampionship.drivers</code> attribute. 
	 * @param value the drivers
	 */
	public void setDrivers(final Collection<Driver> value)
	{
		setDrivers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to drivers. 
	 * @param value the item to add to drivers
	 */
	public void addToDrivers(final SessionContext ctx, final Driver value)
	{
		DRIVERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to drivers. 
	 * @param value the item to add to drivers
	 */
	public void addToDrivers(final Driver value)
	{
		addToDrivers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from drivers. 
	 * @param value the item to remove from drivers
	 */
	public void removeFromDrivers(final SessionContext ctx, final Driver value)
	{
		DRIVERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from drivers. 
	 * @param value the item to remove from drivers
	 */
	public void removeFromDrivers(final Driver value)
	{
		removeFromDrivers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RaceChampionship.granPrix</code> attribute.
	 * @return the granPrix
	 */
	public Collection<GranPrix> getGranPrix(final SessionContext ctx)
	{
		return GRANPRIXHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RaceChampionship.granPrix</code> attribute.
	 * @return the granPrix
	 */
	public Collection<GranPrix> getGranPrix()
	{
		return getGranPrix( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RaceChampionship.granPrix</code> attribute. 
	 * @param value the granPrix
	 */
	public void setGranPrix(final SessionContext ctx, final Collection<GranPrix> value)
	{
		GRANPRIXHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RaceChampionship.granPrix</code> attribute. 
	 * @param value the granPrix
	 */
	public void setGranPrix(final Collection<GranPrix> value)
	{
		setGranPrix( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to granPrix. 
	 * @param value the item to add to granPrix
	 */
	public void addToGranPrix(final SessionContext ctx, final GranPrix value)
	{
		GRANPRIXHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to granPrix. 
	 * @param value the item to add to granPrix
	 */
	public void addToGranPrix(final GranPrix value)
	{
		addToGranPrix( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from granPrix. 
	 * @param value the item to remove from granPrix
	 */
	public void removeFromGranPrix(final SessionContext ctx, final GranPrix value)
	{
		GRANPRIXHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from granPrix. 
	 * @param value the item to remove from granPrix
	 */
	public void removeFromGranPrix(final GranPrix value)
	{
		removeFromGranPrix( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RaceChampionship.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RaceChampionship.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RaceChampionship.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RaceChampionship.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RaceChampionship.stableRanking</code> attribute.
	 * @return the stableRanking - Stable Ranking
	 */
	public StableRanking getStableRanking(final SessionContext ctx)
	{
		return (StableRanking)getProperty( ctx, STABLERANKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RaceChampionship.stableRanking</code> attribute.
	 * @return the stableRanking - Stable Ranking
	 */
	public StableRanking getStableRanking()
	{
		return getStableRanking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RaceChampionship.stableRanking</code> attribute. 
	 * @param value the stableRanking - Stable Ranking
	 */
	public void setStableRanking(final SessionContext ctx, final StableRanking value)
	{
		setProperty(ctx, STABLERANKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RaceChampionship.stableRanking</code> attribute. 
	 * @param value the stableRanking - Stable Ranking
	 */
	public void setStableRanking(final StableRanking value)
	{
		setStableRanking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RaceChampionship.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RaceChampionship.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RaceChampionship.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RaceChampionship.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final EnumerationValue value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
}
