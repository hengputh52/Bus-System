package bus;

public class BusBooking {
    String BookingID;  //generated ID
    String CustomerID; //generated ID
    String BusID;
    String RouteID;
    String PickupStopID;
    String DropStopID;
    String BookingTime;
    String TravelDate;
    String ReturnDate;
    String TicketType;
    int Total_Seat;





    public BusBooking(String bookingID, String customerID, String busID, String routeID, String pickupStopID, String dropStopID, String bookingTime, String travelDate, String returnDate, String ticketType, int total_Seat) {
        BookingID = bookingID;
        CustomerID = customerID;
        BusID = busID;
        RouteID = routeID;
        PickupStopID = pickupStopID;
        DropStopID = dropStopID;
        BookingTime = bookingTime;
        TravelDate = travelDate;
        ReturnDate = returnDate;
        TicketType = ticketType;
        Total_Seat = total_Seat;
    }

    public BusBooking(String bookingID, String customerID, String busID, String routeID, String pickupStopID, String dropStopID, String bookingTime, String travelDate, String ticketType, int total_Seat) {
        BookingID = bookingID;
        CustomerID = customerID;
        BusID = busID;
        RouteID = routeID;
        PickupStopID = pickupStopID;
        DropStopID = dropStopID;
        BookingTime = bookingTime;
        TravelDate = travelDate;
        TicketType = ticketType;
        Total_Seat = total_Seat;
    }
}
