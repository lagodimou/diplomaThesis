/**
 * Proximity Parameter.
 * It determines how much is the ranking vector returned from
 * {@code HIRItemScorer} affected by the inter-item relationships
 * that derive from the categorization of items.
 */

@Documented
@DefaultDouble(0.3)
@Parameter(Double.class)
@Qualifier
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ProximityParameter {
}
