package bus;


import java.util.ArrayList;
import java.util.List;

class Location implements LocationInfo {
    private static int idCounter = 1;
    private static int locationCount = 0;
    private int id;
    private String lName;
    private String address;

    // Static list to store all locations
    private static List<Location> locationList = new ArrayList<>();

    Location(String lName, String address) {
        this.id = idCounter++;
        this.lName = lName;
        this.address = address;
        locationList.add(this);
        locationCount++;
    }

    public String toString() {
        return "ID: " + id + ", Location: " + lName + ", Address: " + address;
    }

    protected int getId() {
        return id;
    }

    protected String getlName() {
        return lName;
    }

    protected String getAddress() {
        return address;
    }

    // Method to get all stored locations
    public static List<Location> getAllLocations() {
        return locationList;
    }

    // Search location by ID
    public static Location searchById(int searchId) {
        for (Location loc : locationList) {
            if (loc.id == searchId) {
                return loc;
            }
        }
        return null;
    }

    // Delete location by ID
    public static boolean deleteById(int deleteId) {
        for (Location loc : locationList) {
            if (loc.id == deleteId) {
                locationList.remove(loc);
                locationCount--;
                return true; 
            }
        }
        return false; 
    }

    // Method to get total number of locations
    public static int getTotalLocations() {
        return locationCount;
    }
}