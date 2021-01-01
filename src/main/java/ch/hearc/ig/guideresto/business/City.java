package ch.hearc.ig.guideresto.business;
import java.sql.Timestamp;
public class City extends CityAbstract
{
	public City()
	{
		super();
		// You must not modify this constructor. Mithra calls this internally.
		// You can call this constructor. You can also add new constructors.
	}

  public void removeRestaurant(Restaurant restaurant) {
		getRestaurants().remove(restaurant);
		restaurant.setCity(null);
  }

	public void addRestaurant(Restaurant restaurant) {
		getRestaurants().add(restaurant);
		restaurant.setCity(this);
	}
}
