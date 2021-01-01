package ch.hearc.ig.guideresto.business;
import java.sql.Timestamp;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Restaurant extends RestaurantAbstract
{
	public Restaurant()
	{
		super();
		// You must not modify this constructor. Mithra calls this internally.
		// You can call this constructor. You can also add new constructors.
	}

	public Set<Evaluation> getEvaluations() {
		return Stream.concat(
				Stream.of(getBasicEvaluations().elements()),
				Stream.of(getCompleteEvaluations().elements()))
				.collect(Collectors.toSet());
	}
}
