package ch.hearc.ig.guideresto.persistence.reladomo;

import ch.hearc.ig.guideresto.business.CompleteEvaluationFinder;
import ch.hearc.ig.guideresto.business.Restaurant;
import ch.hearc.ig.guideresto.business.RestaurantFinder;
import ch.hearc.ig.guideresto.business.RestaurantList;
import ch.hearc.ig.guideresto.business.RestaurantType;
import ch.hearc.ig.guideresto.persistence.RestaurantDAO;
import java.util.HashSet;
import java.util.Set;

public class RestaurantDAOReladomo implements RestaurantDAO {

  @Override
  public void insert(Restaurant restaurant) {

  }

  @Override
  public Set<Restaurant> researchAll() {
    RestaurantList restaurants = RestaurantFinder.findMany(RestaurantFinder.all());
    restaurants.deepFetch(RestaurantFinder.basicEvaluations());
    restaurants.deepFetch(RestaurantFinder.completeEvaluations());
    restaurants.deepFetch(RestaurantFinder.completeEvaluations().grades());
    return new HashSet<>(restaurants);
  }

  @Override
  public Set<Restaurant> researchByName(String name) {
    return null;
  }

  @Override
  public Set<Restaurant> researchByCityName(String cityName) {
    return null;
  }

  @Override
  public Set<Restaurant> researchByType(RestaurantType type) {
    return null;
  }

  @Override
  public Restaurant researchById(Integer id) {
    Restaurant restaurant = RestaurantFinder.findOne(RestaurantFinder.id().eq(id));
    restaurant.getCompleteEvaluations().deepFetch(CompleteEvaluationFinder.grades());
    return restaurant;
  }

  @Override
  public void update(Restaurant restaurant) {

  }

  @Override
  public void delete(Restaurant restaurant) {

  }
}
