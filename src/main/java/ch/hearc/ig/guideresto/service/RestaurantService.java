package ch.hearc.ig.guideresto.service;

import static ch.hearc.ig.guideresto.persistence.reladomo.ReladamoDataSource.inTransaction;

import ch.hearc.ig.guideresto.business.*;
import ch.hearc.ig.guideresto.persistence.AbstractDAOFactory;
import ch.hearc.ig.guideresto.persistence.BasicEvaluationDAO;
import ch.hearc.ig.guideresto.persistence.CityDAO;
import ch.hearc.ig.guideresto.persistence.CompleteEvaluationDAO;
import ch.hearc.ig.guideresto.persistence.EvaluationCriteriaDAO;
import ch.hearc.ig.guideresto.persistence.RestaurantDAO;
import ch.hearc.ig.guideresto.persistence.RestaurantTypeDAO;

import java.util.Set;

public class RestaurantService {

  private final RestaurantDAO restaurantDAO;
  private final RestaurantTypeDAO restaurantTypeDAO;
  private final CityDAO cityDAO;
  private final BasicEvaluationDAO basicEvaluationDAO;
  private final CompleteEvaluationDAO completeEvaluationDAO;
  private final EvaluationCriteriaDAO evaluationCriteriaDAO;

  public RestaurantService(AbstractDAOFactory daoFactory) {
    this.restaurantDAO = daoFactory.getRestaurantDAO();
    this.restaurantTypeDAO = daoFactory.getRestaurantTypeDAO();
    this.cityDAO = daoFactory.getCityDAO();
    this.basicEvaluationDAO = daoFactory.getBasicEvaluationDAO();
    this.completeEvaluationDAO = daoFactory.getCompleteEvaluationDAO();
    this.evaluationCriteriaDAO = daoFactory.getEvaluationCriteriaDAO();
  }

  public void insertCity(String cityZipCode, String cityName) {
    inTransaction(() -> cityDAO.insert(cityZipCode, cityName));
  }

  public void insertBasicEvaluation(BasicEvaluation basicEvaluation) {
    inTransaction(() -> basicEvaluationDAO.insertBasicEvaluation(basicEvaluation));
  }

  public Set<Restaurant> researchAllRestaurants() {
    return inTransaction(restaurantDAO::researchAll);
  }

  public Restaurant researchById(Integer restaurantId) {
    return inTransaction(() -> restaurantDAO.researchById(restaurantId));
  }

  public Set<Restaurant> researchByName(String name) {
    return inTransaction(() -> restaurantDAO.researchByName(name));
  }

  public Set<Restaurant> researchByCity(String cityName) {
    return inTransaction(() -> restaurantDAO.researchByCityName(cityName));
  }

  public Set<City> researchAllCities() {
    return inTransaction(cityDAO::researchAll);
  }

  public Set<RestaurantType> researchAllRestaurantTypes() {
    return inTransaction(restaurantTypeDAO::researchAll);
  }

  public void insertRestaurant(Restaurant restaurant) {
    inTransaction(() -> restaurantDAO.insert(restaurant));
  }

  public Set<EvaluationCriteria> researchAllEvaluationCritierias() {
    return inTransaction(evaluationCriteriaDAO::researchAll);
  }

  public void insertCompleteEvaluation(CompleteEvaluation completeEvaluation) {
    inTransaction(() -> completeEvaluationDAO.insertCompleteEvaluation(completeEvaluation));
  }

  public void updateRestaurant(Restaurant restaurant) {
    inTransaction(() -> restaurantDAO.update(restaurant));
  }

  public void deleteRestaurant(Restaurant restaurant) {
    inTransaction(() -> restaurantDAO.delete(restaurant));
  }

  public Set<Restaurant> researchByType(RestaurantType type) {
    return restaurantDAO.researchByType(type);
  }
}
