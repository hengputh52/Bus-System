package bus;

public class BusBooking {
    String BusID;  //generated ID
    String Destination;
    String Departure_Time;
    String Type_Ticket;
    int Total_Seat;
    String Type_Seat;
    String Seat;
    double Total_Price;


    BusBooking()
    {
        BusID = "unknown";
        Destination = "unknown";
        Departure_Time = "unknown";
        Total_Seat = 0;
        Type_Ticket = "unknown";
        Type_Seat = "unknown";
        Seat = "unknown";
        Total_Price = 0;
    }


    BusBooking(String busID, String destination, String departure_time, int total_seat,String type_ticket, String type_seat, String seat, double total_price)
    {
        BusID = busID;
        Destination = destination;
        Departure_Time = departure_time;
        Total_Seat = total_seat;
        Type_Ticket = type_ticket;
        Type_Seat = type_seat;
        Seat = seat;
        Total_Price = total_price;
    }
}
