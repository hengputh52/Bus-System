package bus;

public class BusBooking {
    String BusID;  //generated ID
    int Month;
    int Day;
    int Year;
    String Destination;
    String Departure_Time;
    String Statue;
    String Type_Ticket;
    int Total_Seat;
    String Type_Seat;
    String Seat;
    double Total_Price;



    BusBooking()
    {
        BusID = "unknown";
        Day = 0;
        Month = 0;
        Year = 0;
        Destination = "unknown";
        Departure_Time = "unknown";
        Statue = "unknown";
        Total_Seat = 0;
        Type_Ticket = "unknown";
        Type_Seat = "unknown";
        Seat = "unknown";
        Total_Price = 0;
    }


    BusBooking(String busID, int month, int date, int year, String destination, String departure_time, String statue ,int total_seat,String type_ticket, String type_seat, String seat, double total_price)
    {
        BusID = busID;
        Month = month;
        Day = date;
        Year = year;
        Destination = destination;
        Departure_Time = departure_time;
        Statue = statue;
        Total_Seat = total_seat;
        Type_Ticket = type_ticket;
        Type_Seat = type_seat;
        Seat = seat;
        Total_Price = total_price;
    }
}
