package bus;

import java.util.List;
public interface ILocation {
    List<Location> getAllLocations();
    Location getLocationById(int id);
    boolean removeLocationById(int id);
}