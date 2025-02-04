package bus;

public class BusBooking {
    static int BookingID = 0;  //generated ID
    int CustomerID; //generated ID
    int BusID;
    int RouteID;
    int PickupStopID;
    int DropStopID;
    String BookingTime;
    String TravelDate;
    String ReturnDate;
    String TicketType;
    int Total_Seat;


    public BusBooking(int bookingID, int customerID, int busID, int routeID, int pickupStopID, int dropStopID, String bookingTime, String travelDate, String returnDate, String ticketType, int total_Seat) {
        BookingID = bookingID + 1;
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
