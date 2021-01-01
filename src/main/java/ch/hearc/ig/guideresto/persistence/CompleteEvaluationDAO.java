package ch.hearc.ig.guideresto.persistence;

import ch.hearc.ig.guideresto.business.CompleteEvaluation;
import ch.hearc.ig.guideresto.business.Restaurant;
import java.time.LocalDate;

/**
 * <p>Interface permettant l'implémentation d l'Abstract Factory et du pattern DAO</p>
 * <strong>Points clés</strong>
 * <ul>
 * <li>SOLI<strong>D</strong> - Dependency Inversion Principle : On ne dépend pas de classes
 * concrètes mais d'interfaces</li>
 * <li>DAO : Interface commune</li>
 * <li>Abstract Factory : Interface</li>
 * </ul>
 */
public interface CompleteEvaluationDAO {

  void insertCompleteEvaluation(CompleteEvaluation completeEval);
}
