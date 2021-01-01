package ch.hearc.ig.guideresto.persistence.reladomo;

import ch.hearc.ig.guideresto.business.City;
import ch.hearc.ig.guideresto.business.CityFinder;
import ch.hearc.ig.guideresto.persistence.CityDAO;
import java.util.HashSet;
import java.util.Set;

public class CityDAOReladomo implements CityDAO {

  @Override
  public Set<City> researchAll() {
    return new HashSet<>(CityFinder.findMany(CityFinder.all()));
  }

  @Override
  public City insert(String zipCode, String name) {
    City city = new City();
    city.setCityName(name);
    city.setZipCode(zipCode);
    city.insert();
    return city;
  }
}
