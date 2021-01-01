package ch.hearc.ig.guideresto.business;
import com.gs.fw.finder.Operation;
import java.util.*;
public class CityList extends CityListAbstract
{
	public CityList()
	{
		super();
	}

	public CityList(int initialSize)
	{
		super(initialSize);
	}

	public CityList(Collection c)
	{
		super(c);
	}

	public CityList(Operation operation)
	{
		super(operation);
	}
}
