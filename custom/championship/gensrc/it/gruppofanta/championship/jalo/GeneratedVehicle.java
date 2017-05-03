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
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import it.gruppofanta.championship.constants.ChampionshipConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Vehicle}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVehicle extends GenericItem
{
	/** Qualifier of the <code>Vehicle.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Vehicle.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Vehicle.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>Vehicle.hp</code> attribute **/
	public static final String HP = "hp";
	/** Qualifier of the <code>Vehicle.engineSize</code> attribute **/
	public static final String ENGINESIZE = "engineSize";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(HP, AttributeMode.INITIAL);
		tmp.put(ENGINESIZE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.engineSize</code> attribute.
	 * @return the engineSize
	 */
	public Integer getEngineSize(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ENGINESIZE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.engineSize</code> attribute.
	 * @return the engineSize
	 */
	public Integer getEngineSize()
	{
		return getEngineSize( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.engineSize</code> attribute. 
	 * @return the engineSize
	 */
	public int getEngineSizeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getEngineSize( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.engineSize</code> attribute. 
	 * @return the engineSize
	 */
	public int getEngineSizeAsPrimitive()
	{
		return getEngineSizeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.engineSize</code> attribute. 
	 * @param value the engineSize
	 */
	public void setEngineSize(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ENGINESIZE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.engineSize</code> attribute. 
	 * @param value the engineSize
	 */
	public void setEngineSize(final Integer value)
	{
		setEngineSize( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.engineSize</code> attribute. 
	 * @param value the engineSize
	 */
	public void setEngineSize(final SessionContext ctx, final int value)
	{
		setEngineSize( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.engineSize</code> attribute. 
	 * @param value the engineSize
	 */
	public void setEngineSize(final int value)
	{
		setEngineSize( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.hp</code> attribute.
	 * @return the hp - Horse power
	 */
	public Integer getHp(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, HP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.hp</code> attribute.
	 * @return the hp - Horse power
	 */
	public Integer getHp()
	{
		return getHp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.hp</code> attribute. 
	 * @return the hp - Horse power
	 */
	public int getHpAsPrimitive(final SessionContext ctx)
	{
		Integer value = getHp( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.hp</code> attribute. 
	 * @return the hp - Horse power
	 */
	public int getHpAsPrimitive()
	{
		return getHpAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.hp</code> attribute. 
	 * @param value the hp - Horse power
	 */
	public void setHp(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, HP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.hp</code> attribute. 
	 * @param value the hp - Horse power
	 */
	public void setHp(final Integer value)
	{
		setHp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.hp</code> attribute. 
	 * @param value the hp - Horse power
	 */
	public void setHp(final SessionContext ctx, final int value)
	{
		setHp( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.hp</code> attribute. 
	 * @param value the hp - Horse power
	 */
	public void setHp(final int value)
	{
		setHp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Vehicle.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Vehicle.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final EnumerationValue value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
}
