/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 4-mag-2017 23.26.12                         ---
 * ----------------------------------------------------------------
 */
package it.gruppofanta.championship.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import it.gruppofanta.championship.constants.ChampionshipConstants;
import it.gruppofanta.championship.jalo.DriverEntry;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem DriverRanking}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDriverRanking extends GenericItem
{
	/** Qualifier of the <code>DriverRanking.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>DriverRanking.driversEntry</code> attribute **/
	public static final String DRIVERSENTRY = "driversEntry";
	/**
	* {@link OneToManyHandler} for handling 1:n DRIVERSENTRY's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DriverEntry> DRIVERSENTRYHANDLER = new OneToManyHandler<DriverEntry>(
	ChampionshipConstants.TC.DRIVERENTRY,
	false,
	"driverRanking",
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
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverRanking.code</code> attribute.
	 * @return the code - Code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverRanking.code</code> attribute.
	 * @return the code - Code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverRanking.code</code> attribute. 
	 * @param value the code - Code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverRanking.code</code> attribute. 
	 * @param value the code - Code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverRanking.driversEntry</code> attribute.
	 * @return the driversEntry
	 */
	public Collection<DriverEntry> getDriversEntry(final SessionContext ctx)
	{
		return DRIVERSENTRYHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverRanking.driversEntry</code> attribute.
	 * @return the driversEntry
	 */
	public Collection<DriverEntry> getDriversEntry()
	{
		return getDriversEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverRanking.driversEntry</code> attribute. 
	 * @param value the driversEntry
	 */
	public void setDriversEntry(final SessionContext ctx, final Collection<DriverEntry> value)
	{
		DRIVERSENTRYHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverRanking.driversEntry</code> attribute. 
	 * @param value the driversEntry
	 */
	public void setDriversEntry(final Collection<DriverEntry> value)
	{
		setDriversEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to driversEntry. 
	 * @param value the item to add to driversEntry
	 */
	public void addToDriversEntry(final SessionContext ctx, final DriverEntry value)
	{
		DRIVERSENTRYHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to driversEntry. 
	 * @param value the item to add to driversEntry
	 */
	public void addToDriversEntry(final DriverEntry value)
	{
		addToDriversEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from driversEntry. 
	 * @param value the item to remove from driversEntry
	 */
	public void removeFromDriversEntry(final SessionContext ctx, final DriverEntry value)
	{
		DRIVERSENTRYHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from driversEntry. 
	 * @param value the item to remove from driversEntry
	 */
	public void removeFromDriversEntry(final DriverEntry value)
	{
		removeFromDriversEntry( getSession().getSessionContext(), value );
	}
	
}
