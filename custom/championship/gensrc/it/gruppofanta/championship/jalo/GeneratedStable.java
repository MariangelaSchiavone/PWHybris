/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 4-mag-2017 1.12.48                          ---
 * ----------------------------------------------------------------
 */
package it.gruppofanta.championship.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import it.gruppofanta.championship.constants.ChampionshipConstants;
import it.gruppofanta.championship.jalo.Driver;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
	/** Qualifier of the <code>Stable.drivers</code> attribute **/
	public static final String DRIVERS = "drivers";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(NATION, AttributeMode.INITIAL);
		tmp.put(DRIVERS, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>Stable.drivers</code> attribute.
	 * @return the drivers
	 */
	public List<Driver> getDrivers(final SessionContext ctx)
	{
		List<Driver> coll = (List<Driver>)getProperty( ctx, DRIVERS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stable.drivers</code> attribute.
	 * @return the drivers
	 */
	public List<Driver> getDrivers()
	{
		return getDrivers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stable.drivers</code> attribute. 
	 * @param value the drivers
	 */
	public void setDrivers(final SessionContext ctx, final List<Driver> value)
	{
		setProperty(ctx, DRIVERS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stable.drivers</code> attribute. 
	 * @param value the drivers
	 */
	public void setDrivers(final List<Driver> value)
	{
		setDrivers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stable.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stable.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stable.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stable.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stable.nation</code> attribute.
	 * @return the nation
	 */
	public String getNation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Stable.nation</code> attribute.
	 * @return the nation
	 */
	public String getNation()
	{
		return getNation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stable.nation</code> attribute. 
	 * @param value the nation
	 */
	public void setNation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Stable.nation</code> attribute. 
	 * @param value the nation
	 */
	public void setNation(final String value)
	{
		setNation( getSession().getSessionContext(), value );
	}
	
}
