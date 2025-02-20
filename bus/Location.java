package bus;


import java.util.ArrayList;
import java.util.List;

public class Location implements ILocation {
    String locationName;
    String city;
    String state;
    String country;
    static int totalLocation = 0;
    private int locationID;


    private static List<Location> locationsList = new ArrayList<>();

    public Location(String locationName, String city, String state, String country, int locationID, int numberOfLocation) {
        this.locationName = locationName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.locationID = locationID;
        totalLocation++;
    }

    //Returns the all location
    public static List<Location> getAllLocations() {
        return new ArrayList<>(locationsList);
    }

    //Returns the location by id
    public static Location getLocationById(int id) {
        for (Location loc : locationsList) {
            if (loc.locationID == id) {
                return loc;
            }
        }
        return null;
    }
    
    //Removes the location by id
    public static boolean removeLocationById(int id) {
        return locationsList.removeIf(loc -> loc.locationID == id);
    }
}
