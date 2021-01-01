package ch.hearc.ig.guideresto.business;
import com.gs.fw.finder.Operation;
import java.util.*;
public class EvaluationCriteriaList extends EvaluationCriteriaListAbstract
{
	public EvaluationCriteriaList()
	{
		super();
	}

	public EvaluationCriteriaList(int initialSize)
	{
		super(initialSize);
	}

	public EvaluationCriteriaList(Collection c)
	{
		super(c);
	}

	public EvaluationCriteriaList(Operation operation)
	{
		super(operation);
	}
}
