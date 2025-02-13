package bus;

import java.util.List;

public interface ILocation {
    // Method to get all locations
    List<Location> getAllLocations();

    // Method to get a location by ID
    Location getLocationById(int id);

    // Method to remove a location by ID
    boolean removeLocationById(int id);
}