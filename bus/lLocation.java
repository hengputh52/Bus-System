package bus;


import java.util.List;
public interface lLocation {
    List<Location> getAllLocations();
    Location getLocationById(int id);
    boolean removeLocationById(int id);
}