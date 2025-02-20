package bus;
import java.util.List;
import java.util.ArrayList;

public class Bus {
    
    public static void main(String[] args) {
        
    //    BusBooking b1 = new BusBooking(1, 1, 1, 1, 1, "10:00", "2021-10-10", "2021-10-11", "AC", 50);    
    //     System.out.println(b1.toString());
    //     BusBooking b2 = new BusBooking(2, 2, 2, 2, 2, "11:00", "2021-10-10", "2021-10-11", "NON-AC", 50);
    //     System.out.println(b2.equals(b1));
    Location loc1 = new Location("Central Bus Station", "New York", "NY", "USA");
    Location loc2 = new Location("Downtown Terminal", "Los Angeles", "CA", "USA");
    Location loc3 = new Location("Main Street Hub", "Chicago", "IL", "USA");

    // Display all locations
    System.out.println("All Locations:");
    displayLocations(loc1.getAllLocations());

    }    

}
