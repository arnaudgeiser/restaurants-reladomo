package ch.hearc.ig.guideresto.business;
import com.gs.fw.finder.Operation;
import java.util.*;
public class RestaurantList extends RestaurantListAbstract
{
	public RestaurantList()
	{
		super();
	}

	public RestaurantList(int initialSize)
	{
		super(initialSize);
	}

	public RestaurantList(Collection c)
	{
		super(c);
	}

	public RestaurantList(Operation operation)
	{
		super(operation);
	}
}
