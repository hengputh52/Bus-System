package bus;

public class BusBookingPremuin extends BusBooking{
    public BusBookingPremuin(int CustomerID, int BusID, int RouteID, int PickupStopID, int DropStopID, String BookingTime, String TravelDate, String ReturnDate, int Total_Seat) {
        super(CustomerID, BusID, RouteID, PickupStopID, DropStopID, BookingTime, TravelDate, ReturnDate, Total_Seat);
    }
    public BusBookingPremuin(int CustomerID, int BusID, int RouteID, int PickupStopID, int DropStopID, String BookingTime, String TravelDate, int Total_Seat) {
        super(CustomerID, BusID, RouteID, PickupStopID, DropStopID, BookingTime, TravelDate, Total_Seat);
    }

}
