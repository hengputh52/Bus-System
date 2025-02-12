package bus;
public class Bus {
    public static void main(String[] args) {
        
       BusBooking busBooking = new BusBooking(1, 1, 1, 1, 1, "10:00", "2021-10-10", "2021-10-11", "AC", 50);    
         System.out.println("Booking ID: " + busBooking.getBookingID());
    }    

}
