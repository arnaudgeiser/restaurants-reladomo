package ch.hearc.ig.guideresto.business;
import com.gs.fw.finder.Operation;
import java.util.*;
public class BasicEvaluationList extends BasicEvaluationListAbstract
{
	public BasicEvaluationList()
	{
		super();
	}

	public BasicEvaluationList(int initialSize)
	{
		super(initialSize);
	}

	public BasicEvaluationList(Collection c)
	{
		super(c);
	}

	public BasicEvaluationList(Operation operation)
	{
		super(operation);
	}
}
