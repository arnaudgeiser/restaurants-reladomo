package ch.hearc.ig.guideresto.persistence;

import ch.hearc.ig.guideresto.business.RestaurantType;

import java.util.Set;

/**
 * <p>Interface permettant l'implémentation d l'Abstract Factory et du pattern DAO</p>
 * <strong>Points clés</strong>
 * <ul>
 *     <li>SOLI<strong>D</strong> - Dependency Inversion Principle : On ne dépend pas de classes
 *         concrètes mais d'interfaces</li>
 *     <li>DAO : Interface commune</li>
 *     <li>Abstract Factory : Interface</li>
 * </ul>
 */
public interface RestaurantTypeDAO {
    Set<RestaurantType> researchAll();
}
