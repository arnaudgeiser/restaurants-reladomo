package ch.hearc.ig.guideresto.business;
import com.gs.fw.finder.Operation;
import java.util.*;
public class RestaurantTypeList extends RestaurantTypeListAbstract
{
	public RestaurantTypeList()
	{
		super();
	}

	public RestaurantTypeList(int initialSize)
	{
		super(initialSize);
	}

	public RestaurantTypeList(Collection c)
	{
		super(c);
	}

	public RestaurantTypeList(Operation operation)
	{
		super(operation);
	}
}
