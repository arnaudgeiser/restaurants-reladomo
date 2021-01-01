package ch.hearc.ig.guideresto.persistence.reladomo;

import ch.hearc.ig.guideresto.persistence.AbstractDAOFactory;
import ch.hearc.ig.guideresto.persistence.BasicEvaluationDAO;
import ch.hearc.ig.guideresto.persistence.CityDAO;
import ch.hearc.ig.guideresto.persistence.CompleteEvaluationDAO;
import ch.hearc.ig.guideresto.persistence.EvaluationCriteriaDAO;
import ch.hearc.ig.guideresto.persistence.RestaurantDAO;
import ch.hearc.ig.guideresto.persistence.RestaurantTypeDAO;

public class ReladomoDAOFactory extends AbstractDAOFactory {

  @Override
  public EvaluationCriteriaDAO getEvaluationCriteriaDAO() {
    return null;
  }

  @Override
  public CityDAO getCityDAO() {
    return new CityDAOReladomo();
  }

  @Override
  public RestaurantTypeDAO getRestaurantTypeDAO() {
    return null;
  }

  @Override
  public RestaurantDAO getRestaurantDAO() {
    return new RestaurantDAOReladomo();
  }

  @Override
  public BasicEvaluationDAO getBasicEvaluationDAO() {
    return null;
  }

  @Override
  public CompleteEvaluationDAO getCompleteEvaluationDAO() {
    return null;
  }
}
