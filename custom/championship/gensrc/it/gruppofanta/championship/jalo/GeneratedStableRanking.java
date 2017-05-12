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
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import it.gruppofanta.championship.constants.ChampionshipConstants;
import it.gruppofanta.championship.jalo.StableEntry;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem StableRanking}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStableRanking extends GenericItem
{
	/** Qualifier of the <code>StableRanking.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>StableRanking.stablesEntry</code> attribute **/
	public static final String STABLESENTRY = "stablesEntry";
	/**
	* {@link OneToManyHandler} for handling 1:n STABLESENTRY's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<StableEntry> STABLESENTRYHANDLER = new OneToManyHandler<StableEntry>(
	ChampionshipConstants.TC.STABLEENTRY,
	false,
	"stableRanking",
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
	 * <i>Generated method</i> - Getter of the <code>StableRanking.code</code> attribute.
	 * @return the code - Code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableRanking.code</code> attribute.
	 * @return the code - Code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableRanking.code</code> attribute. 
	 * @param value the code - Code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableRanking.code</code> attribute. 
	 * @param value the code - Code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableRanking.stablesEntry</code> attribute.
	 * @return the stablesEntry
	 */
	public Collection<StableEntry> getStablesEntry(final SessionContext ctx)
	{
		return STABLESENTRYHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableRanking.stablesEntry</code> attribute.
	 * @return the stablesEntry
	 */
	public Collection<StableEntry> getStablesEntry()
	{
		return getStablesEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableRanking.stablesEntry</code> attribute. 
	 * @param value the stablesEntry
	 */
	public void setStablesEntry(final SessionContext ctx, final Collection<StableEntry> value)
	{
		STABLESENTRYHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableRanking.stablesEntry</code> attribute. 
	 * @param value the stablesEntry
	 */
	public void setStablesEntry(final Collection<StableEntry> value)
	{
		setStablesEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stablesEntry. 
	 * @param value the item to add to stablesEntry
	 */
	public void addToStablesEntry(final SessionContext ctx, final StableEntry value)
	{
		STABLESENTRYHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to stablesEntry. 
	 * @param value the item to add to stablesEntry
	 */
	public void addToStablesEntry(final StableEntry value)
	{
		addToStablesEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stablesEntry. 
	 * @param value the item to remove from stablesEntry
	 */
	public void removeFromStablesEntry(final SessionContext ctx, final StableEntry value)
	{
		STABLESENTRYHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from stablesEntry. 
	 * @param value the item to remove from stablesEntry
	 */
	public void removeFromStablesEntry(final StableEntry value)
	{
		removeFromStablesEntry( getSession().getSessionContext(), value );
	}
	
}
