package bus;

import java.util.ArrayList;
import java.util.List;

public class Location implements ILocation {
    private String locationName;
    private String city;
    private String state;
    private String country;
    private int locationID;
    
    private static int totalLocation = 0;
    private static List<Location> locationsList = new ArrayList<>();

    public Location(String locationName, String city, String state, String country) {
        if (locationName == null || locationName.isEmpty() ||
            city == null || city.isEmpty() ||
            state == null || state.isEmpty() ||
            country == null || country.isEmpty()) {
            throw new IllegalArgumentException("Location details cannot be empty.");
        }
        
        this.locationName = locationName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.locationID = ++totalLocation;
        
        locationsList.add(this);
    }

    // Getters
    public String getLocationName() { return locationName; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getCountry() { return country; }
    public int getLocationID() { return locationID; }

    // Setters
    public void setLocationName(String locationName) { this.locationName = locationName; }
    public void setCity(String city) { this.city = city; }
    public void setState(String state) { this.state = state; }
    public void setCountry(String country) { this.country = country; }

    @Override
    public List<Location> getAllLocations() {
        return new ArrayList<>(locationsList);
    }

    @Override
    public Location getLocationById(int id) {
        for (Location loc : locationsList) {
            if (loc.locationID == id) {
                return loc;
            }
        }
        return null;
    }

    @Override
    public boolean removeLocationById(int id) {
        return locationsList.removeIf(loc -> loc.locationID == id);
    }

    // Search locations by city, state, or name
    public static List<Location> searchLocations(String keyword) {
        List<Location> results = new ArrayList<>();
        for (Location loc : locationsList) {
            if (loc.locationName.equalsIgnoreCase(keyword) || 
                loc.city.equalsIgnoreCase(keyword) || 
                loc.state.equalsIgnoreCase(keyword)) {
                results.add(loc);
            }
        }
        return results;
    }

    @Override
    public String toString() {
        return "Location{" +
                "ID=" + locationID +
                ", Name='" + locationName + '\'' +
                ", City='" + city + '\'' +
                ", State='" + state + '\'' +
                ", Country='" + country + '\'' +
                '}';
    }
}
