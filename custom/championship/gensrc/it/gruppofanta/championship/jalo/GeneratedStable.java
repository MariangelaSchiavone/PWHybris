/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 4-mag-2017 22.37.23                         ---
 * ----------------------------------------------------------------
 */
package it.gruppofanta.championship.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import it.gruppofanta.championship.constants.ChampionshipConstants;
import it.gruppofanta.championship.jalo.Vehicle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Stable}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStable extends GenericItem
{
	/** Qualifier of the <code>Stable.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Stable.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Stable.nation</code> attribute **/
	public static final String NATION = "nation";
	/** Qualifier of the <code>Stable.firstVehicle</code> attribute **/
	public static final String FIRSTVEHICLE = "firstVehicle";
	/** Qualifier of the <code>Stable.secondVehicle</code> attribute **/
	public static final String SECONDVEHICLE = "secondVehicle";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(NATION, AttributeMode.INITIAL);
		tmp.put(FIRSTVEHICLE, AttributeMode.INITIAL);
		tmp.put(SECONDVEHICLE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stable.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stable.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stable.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stable.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stable.firstVehicle</code> attribute.
	 * @return the firstVehicle - First Vehicle Team
	 */
	public Vehicle getFirstVehicle(final SessionContext ctx)
	{
		return (Vehicle)getProperty( ctx, FIRSTVEHICLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stable.firstVehicle</code> attribute.
	 * @return the firstVehicle - First Vehicle Team
	 */
	public Vehicle getFirstVehicle()
	{
		return getFirstVehicle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stable.firstVehicle</code> attribute. 
	 * @param value the firstVehicle - First Vehicle Team
	 */
	public void setFirstVehicle(final SessionContext ctx, final Vehicle value)
	{
		setProperty(ctx, FIRSTVEHICLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stable.firstVehicle</code> attribute. 
	 * @param value the firstVehicle - First Vehicle Team
	 */
	public void setFirstVehicle(final Vehicle value)
	{
		setFirstVehicle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stable.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stable.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stable.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stable.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stable.nation</code> attribute.
	 * @return the nation - Nation
	 */
	public String getNation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stable.nation</code> attribute.
	 * @return the nation - Nation
	 */
	public String getNation()
	{
		return getNation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stable.nation</code> attribute. 
	 * @param value the nation - Nation
	 */
	public void setNation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stable.nation</code> attribute. 
	 * @param value the nation - Nation
	 */
	public void setNation(final String value)
	{
		setNation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stable.secondVehicle</code> attribute.
	 * @return the secondVehicle - Second Vehicle Team
	 */
	public Vehicle getSecondVehicle(final SessionContext ctx)
	{
		return (Vehicle)getProperty( ctx, SECONDVEHICLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stable.secondVehicle</code> attribute.
	 * @return the secondVehicle - Second Vehicle Team
	 */
	public Vehicle getSecondVehicle()
	{
		return getSecondVehicle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stable.secondVehicle</code> attribute. 
	 * @param value the secondVehicle - Second Vehicle Team
	 */
	public void setSecondVehicle(final SessionContext ctx, final Vehicle value)
	{
		setProperty(ctx, SECONDVEHICLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stable.secondVehicle</code> attribute. 
	 * @param value the secondVehicle - Second Vehicle Team
	 */
	public void setSecondVehicle(final Vehicle value)
	{
		setSecondVehicle( getSession().getSessionContext(), value );
	}
	
}
