package ch.hearc.ig.guideresto.persistence;

import ch.hearc.ig.guideresto.business.Restaurant;
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
public interface RestaurantDAO {
    void insert(Restaurant restaurant);

    Set<Restaurant> researchAll();

    Set<Restaurant> researchByName(String name);

    Set<Restaurant> researchByCityName(String cityName);

    Set<Restaurant> researchByType(RestaurantType type);

    Restaurant researchById(Integer id);

    void update(Restaurant restaurant);

    void delete(Restaurant restaurant);
}
