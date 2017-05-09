/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 9-mag-2017 21.24.16                         ---
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
import it.gruppofanta.championship.constants.ChampionshipConstants;
import it.gruppofanta.championship.jalo.RaceChampionship;
import it.gruppofanta.championship.jalo.Vehicle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Driver}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDriver extends GenericItem
{
	/** Qualifier of the <code>Driver.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Driver.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Driver.surname</code> attribute **/
	public static final String SURNAME = "surname";
	/** Qualifier of the <code>Driver.nationality</code> attribute **/
	public static final String NATIONALITY = "nationality";
	/** Qualifier of the <code>Driver.age</code> attribute **/
	public static final String AGE = "age";
	/** Qualifier of the <code>Driver.vehicle</code> attribute **/
	public static final String VEHICLE = "vehicle";
	/** Qualifier of the <code>Driver.raceChampionship</code> attribute **/
	public static final String RACECHAMPIONSHIP = "raceChampionship";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RACECHAMPIONSHIP's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDriver> RACECHAMPIONSHIPHANDLER = new BidirectionalOneToManyHandler<GeneratedDriver>(
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
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SURNAME, AttributeMode.INITIAL);
		tmp.put(NATIONALITY, AttributeMode.INITIAL);
		tmp.put(AGE, AttributeMode.INITIAL);
		tmp.put(VEHICLE, AttributeMode.INITIAL);
		tmp.put(RACECHAMPIONSHIP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.age</code> attribute.
	 * @return the age - Age
	 */
	public Integer getAge(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.age</code> attribute.
	 * @return the age - Age
	 */
	public Integer getAge()
	{
		return getAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.age</code> attribute. 
	 * @return the age - Age
	 */
	public int getAgeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAge( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.age</code> attribute. 
	 * @return the age - Age
	 */
	public int getAgeAsPrimitive()
	{
		return getAgeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.age</code> attribute. 
	 * @param value the age - Age
	 */
	public void setAge(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.age</code> attribute. 
	 * @param value the age - Age
	 */
	public void setAge(final Integer value)
	{
		setAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.age</code> attribute. 
	 * @param value the age - Age
	 */
	public void setAge(final SessionContext ctx, final int value)
	{
		setAge( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.age</code> attribute. 
	 * @param value the age - Age
	 */
	public void setAge(final int value)
	{
		setAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.code</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>Driver.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.nationality</code> attribute.
	 * @return the nationality - Nationality
	 */
	public String getNationality(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NATIONALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.nationality</code> attribute.
	 * @return the nationality - Nationality
	 */
	public String getNationality()
	{
		return getNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.nationality</code> attribute. 
	 * @param value the nationality - Nationality
	 */
	public void setNationality(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NATIONALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.nationality</code> attribute. 
	 * @param value the nationality - Nationality
	 */
	public void setNationality(final String value)
	{
		setNationality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.raceChampionship</code> attribute.
	 * @return the raceChampionship
	 */
	public RaceChampionship getRaceChampionship(final SessionContext ctx)
	{
		return (RaceChampionship)getProperty( ctx, RACECHAMPIONSHIP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.raceChampionship</code> attribute.
	 * @return the raceChampionship
	 */
	public RaceChampionship getRaceChampionship()
	{
		return getRaceChampionship( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.raceChampionship</code> attribute. 
	 * @param value the raceChampionship
	 */
	public void setRaceChampionship(final SessionContext ctx, final RaceChampionship value)
	{
		RACECHAMPIONSHIPHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.raceChampionship</code> attribute. 
	 * @param value the raceChampionship
	 */
	public void setRaceChampionship(final RaceChampionship value)
	{
		setRaceChampionship( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.surname</code> attribute.
	 * @return the surname - Surname
	 */
	public String getSurname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.surname</code> attribute.
	 * @return the surname - Surname
	 */
	public String getSurname()
	{
		return getSurname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.surname</code> attribute. 
	 * @param value the surname - Surname
	 */
	public void setSurname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SURNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.surname</code> attribute. 
	 * @param value the surname - Surname
	 */
	public void setSurname(final String value)
	{
		setSurname( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.vehicle</code> attribute.
	 * @return the vehicle - Vehicle
	 */
	public Vehicle getVehicle(final SessionContext ctx)
	{
		return (Vehicle)getProperty( ctx, VEHICLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Driver.vehicle</code> attribute.
	 * @return the vehicle - Vehicle
	 */
	public Vehicle getVehicle()
	{
		return getVehicle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.vehicle</code> attribute. 
	 * @param value the vehicle - Vehicle
	 */
	public void setVehicle(final SessionContext ctx, final Vehicle value)
	{
		setProperty(ctx, VEHICLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Driver.vehicle</code> attribute. 
	 * @param value the vehicle - Vehicle
	 */
	public void setVehicle(final Vehicle value)
	{
		setVehicle( getSession().getSessionContext(), value );
	}
	
}
