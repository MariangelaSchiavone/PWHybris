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
import it.gruppofanta.championship.jalo.Stable;
import it.gruppofanta.championship.jalo.StableRanking;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem StableEntry}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStableEntry extends GenericItem
{
	/** Qualifier of the <code>StableEntry.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>StableEntry.position</code> attribute **/
	public static final String POSITION = "position";
	/** Qualifier of the <code>StableEntry.points</code> attribute **/
	public static final String POINTS = "points";
	/** Qualifier of the <code>StableEntry.stable</code> attribute **/
	public static final String STABLE = "stable";
	/** Qualifier of the <code>StableEntry.stableRanking</code> attribute **/
	public static final String STABLERANKING = "stableRanking";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STABLERANKING's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedStableEntry> STABLERANKINGHANDLER = new BidirectionalOneToManyHandler<GeneratedStableEntry>(
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
		tmp.put(POSITION, AttributeMode.INITIAL);
		tmp.put(POINTS, AttributeMode.INITIAL);
		tmp.put(STABLE, AttributeMode.INITIAL);
		tmp.put(STABLERANKING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableEntry.code</code> attribute.
	 * @return the code - Code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableEntry.code</code> attribute.
	 * @return the code - Code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableEntry.code</code> attribute. 
	 * @param value the code - Code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableEntry.code</code> attribute. 
	 * @param value the code - Code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		STABLERANKINGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableEntry.points</code> attribute.
	 * @return the points - Points
	 */
	public Integer getPoints(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, POINTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableEntry.points</code> attribute.
	 * @return the points - Points
	 */
	public Integer getPoints()
	{
		return getPoints( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableEntry.points</code> attribute. 
	 * @return the points - Points
	 */
	public int getPointsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPoints( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableEntry.points</code> attribute. 
	 * @return the points - Points
	 */
	public int getPointsAsPrimitive()
	{
		return getPointsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableEntry.points</code> attribute. 
	 * @param value the points - Points
	 */
	public void setPoints(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, POINTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableEntry.points</code> attribute. 
	 * @param value the points - Points
	 */
	public void setPoints(final Integer value)
	{
		setPoints( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableEntry.points</code> attribute. 
	 * @param value the points - Points
	 */
	public void setPoints(final SessionContext ctx, final int value)
	{
		setPoints( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableEntry.points</code> attribute. 
	 * @param value the points - Points
	 */
	public void setPoints(final int value)
	{
		setPoints( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableEntry.position</code> attribute.
	 * @return the position - Position
	 */
	public Integer getPosition(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, POSITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableEntry.position</code> attribute.
	 * @return the position - Position
	 */
	public Integer getPosition()
	{
		return getPosition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableEntry.position</code> attribute. 
	 * @return the position - Position
	 */
	public int getPositionAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPosition( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableEntry.position</code> attribute. 
	 * @return the position - Position
	 */
	public int getPositionAsPrimitive()
	{
		return getPositionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableEntry.position</code> attribute. 
	 * @param value the position - Position
	 */
	public void setPosition(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, POSITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableEntry.position</code> attribute. 
	 * @param value the position - Position
	 */
	public void setPosition(final Integer value)
	{
		setPosition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableEntry.position</code> attribute. 
	 * @param value the position - Position
	 */
	public void setPosition(final SessionContext ctx, final int value)
	{
		setPosition( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableEntry.position</code> attribute. 
	 * @param value the position - Position
	 */
	public void setPosition(final int value)
	{
		setPosition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableEntry.stable</code> attribute.
	 * @return the stable - Stable
	 */
	public Stable getStable(final SessionContext ctx)
	{
		return (Stable)getProperty( ctx, STABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableEntry.stable</code> attribute.
	 * @return the stable - Stable
	 */
	public Stable getStable()
	{
		return getStable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableEntry.stable</code> attribute. 
	 * @param value the stable - Stable
	 */
	public void setStable(final SessionContext ctx, final Stable value)
	{
		setProperty(ctx, STABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableEntry.stable</code> attribute. 
	 * @param value the stable - Stable
	 */
	public void setStable(final Stable value)
	{
		setStable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableEntry.stableRanking</code> attribute.
	 * @return the stableRanking
	 */
	public StableRanking getStableRanking(final SessionContext ctx)
	{
		return (StableRanking)getProperty( ctx, STABLERANKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StableEntry.stableRanking</code> attribute.
	 * @return the stableRanking
	 */
	public StableRanking getStableRanking()
	{
		return getStableRanking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableEntry.stableRanking</code> attribute. 
	 * @param value the stableRanking
	 */
	public void setStableRanking(final SessionContext ctx, final StableRanking value)
	{
		STABLERANKINGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StableEntry.stableRanking</code> attribute. 
	 * @param value the stableRanking
	 */
	public void setStableRanking(final StableRanking value)
	{
		setStableRanking( getSession().getSessionContext(), value );
	}
	
}
