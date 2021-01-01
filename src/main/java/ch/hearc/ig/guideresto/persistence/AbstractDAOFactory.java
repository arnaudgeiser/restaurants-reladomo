package ch.hearc.ig.guideresto.persistence;

import ch.hearc.ig.guideresto.persistence.reladomo.ReladomoDAOFactory;

/**
 * <p>Implémentation du pattern Abstract Factory</p>
 * <strong>Points clés</strong>
 * <ul>
 *     <li>Abstract Factory GOF : Classe abstraite à implémenter afin de créer une nouvelle famille d'objets</li>
 * </ul>
 */
public abstract class AbstractDAOFactory {
    public static AbstractDAOFactory getDAOFactory()
    {
        return new ReladomoDAOFactory();
    }

    public abstract EvaluationCriteriaDAO getEvaluationCriteriaDAO();

    public abstract CityDAO getCityDAO();

    public abstract RestaurantTypeDAO getRestaurantTypeDAO();

    public abstract RestaurantDAO getRestaurantDAO();

    public abstract BasicEvaluationDAO getBasicEvaluationDAO();

    public abstract CompleteEvaluationDAO getCompleteEvaluationDAO();
}
