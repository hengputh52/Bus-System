package bus;
import java.util.List;
import java.util.ArrayList;

public class Bus {
    
    public static void main(String[] args) {
        
       BusBooking bus1 = new BusBooking(1, 1, 1, 1, 1, "10:00", "2021-10-10", "2021-10-11", 2);
       BusBooking bus2 = new BusBooking(2, 2, 2, 2, 2, "11:00", "2021-10-10", 2);
    

        System.out.println("All Bookings:");
        for (BusBooking bus : BusBooking.busBooking) {
            System.out.println(bus);
        }
    }    

}
