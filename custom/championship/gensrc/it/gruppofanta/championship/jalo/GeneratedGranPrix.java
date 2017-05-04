/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 4-mag-2017 22.37.23                         ---
 * ----------------------------------------------------------------
 */
package it.gruppofanta.championship.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import it.gruppofanta.championship.constants.ChampionshipConstants;
import it.gruppofanta.championship.jalo.Placing;
import it.gruppofanta.championship.jalo.RaceChampionship;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem GranPrix}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedGranPrix extends GenericItem
{
	/** Qualifier of the <code>GranPrix.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>GranPrix.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>GranPrix.laps</code> attribute **/
	public static final String LAPS = "laps";
	/** Qualifier of the <code>GranPrix.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>GranPrix.nation</code> attribute **/
	public static final String NATION = "nation";
	/** Qualifier of the <code>GranPrix.raceChampionship</code> attribute **/
	public static final String RACECHAMPIONSHIP = "raceChampionship";
	/** Qualifier of the <code>GranPrix.placings</code> attribute **/
	public static final String PLACINGS = "placings";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RACECHAMPIONSHIP's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedGranPrix> RACECHAMPIONSHIPHANDLER = new BidirectionalOneToManyHandler<GeneratedGranPrix>(
	ChampionshipConstants.TC.GRANPRIX,
	false,
	"raceChampionship",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PLACINGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Placing> PLACINGSHANDLER = new OneToManyHandler<Placing>(
	ChampionshipConstants.TC.PLACING,
	false,
	"granPrix",
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
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(LAPS, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(NATION, AttributeMode.INITIAL);
		tmp.put(RACECHAMPIONSHIP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GranPrix.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GranPrix.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GranPrix.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GranPrix.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		RACECHAMPIONSHIPHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GranPrix.date</code> attribute.
	 * @return the date - Date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GranPrix.date</code> attribute.
	 * @return the date - Date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GranPrix.date</code> attribute. 
	 * @param value the date - Date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GranPrix.date</code> attribute. 
	 * @param value the date - Date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GranPrix.laps</code> attribute.
	 * @return the laps - Laps
	 */
	public Integer getLaps(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, LAPS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GranPrix.laps</code> attribute.
	 * @return the laps - Laps
	 */
	public Integer getLaps()
	{
		return getLaps( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GranPrix.laps</code> attribute. 
	 * @return the laps - Laps
	 */
	public int getLapsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getLaps( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GranPrix.laps</code> attribute. 
	 * @return the laps - Laps
	 */
	public int getLapsAsPrimitive()
	{
		return getLapsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GranPrix.laps</code> attribute. 
	 * @param value the laps - Laps
	 */
	public void setLaps(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, LAPS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GranPrix.laps</code> attribute. 
	 * @param value the laps - Laps
	 */
	public void setLaps(final Integer value)
	{
		setLaps( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GranPrix.laps</code> attribute. 
	 * @param value the laps - Laps
	 */
	public void setLaps(final SessionContext ctx, final int value)
	{
		setLaps( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GranPrix.laps</code> attribute. 
	 * @param value the laps - Laps
	 */
	public void setLaps(final int value)
	{
		setLaps( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GranPrix.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GranPrix.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GranPrix.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GranPrix.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GranPrix.nation</code> attribute.
	 * @return the nation - Nation
	 */
	public String getNation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GranPrix.nation</code> attribute.
	 * @return the nation - Nation
	 */
	public String getNation()
	{
		return getNation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GranPrix.nation</code> attribute. 
	 * @param value the nation - Nation
	 */
	public void setNation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GranPrix.nation</code> attribute. 
	 * @param value the nation - Nation
	 */
	public void setNation(final String value)
	{
		setNation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GranPrix.placings</code> attribute.
	 * @return the placings
	 */
	public Collection<Placing> getPlacings(final SessionContext ctx)
	{
		return PLACINGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GranPrix.placings</code> attribute.
	 * @return the placings
	 */
	public Collection<Placing> getPlacings()
	{
		return getPlacings( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GranPrix.placings</code> attribute. 
	 * @param value the placings
	 */
	public void setPlacings(final SessionContext ctx, final Collection<Placing> value)
	{
		PLACINGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GranPrix.placings</code> attribute. 
	 * @param value the placings
	 */
	public void setPlacings(final Collection<Placing> value)
	{
		setPlacings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to placings. 
	 * @param value the item to add to placings
	 */
	public void addToPlacings(final SessionContext ctx, final Placing value)
	{
		PLACINGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to placings. 
	 * @param value the item to add to placings
	 */
	public void addToPlacings(final Placing value)
	{
		addToPlacings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from placings. 
	 * @param value the item to remove from placings
	 */
	public void removeFromPlacings(final SessionContext ctx, final Placing value)
	{
		PLACINGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from placings. 
	 * @param value the item to remove from placings
	 */
	public void removeFromPlacings(final Placing value)
	{
		removeFromPlacings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GranPrix.raceChampionship</code> attribute.
	 * @return the raceChampionship
	 */
	public RaceChampionship getRaceChampionship(final SessionContext ctx)
	{
		return (RaceChampionship)getProperty( ctx, RACECHAMPIONSHIP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GranPrix.raceChampionship</code> attribute.
	 * @return the raceChampionship
	 */
	public RaceChampionship getRaceChampionship()
	{
		return getRaceChampionship( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GranPrix.raceChampionship</code> attribute. 
	 * @param value the raceChampionship
	 */
	public void setRaceChampionship(final SessionContext ctx, final RaceChampionship value)
	{
		RACECHAMPIONSHIPHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GranPrix.raceChampionship</code> attribute. 
	 * @param value the raceChampionship
	 */
	public void setRaceChampionship(final RaceChampionship value)
	{
		setRaceChampionship( getSession().getSessionContext(), value );
	}
	
}
