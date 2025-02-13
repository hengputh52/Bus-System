package bus;

import java.util.ArrayList;

public class BusBooking implements Booking {
    private static int Booking = 0;  
    private int BookingID;
    private int CustomerID; 
    private int BusID;
    private int RouteID;
    private int PickupStopID;
    private int DropStopID;
    private String BookingTime;
    private String TravelDate;
    private String ReturnDate;
    private String TicketType;
    private int Total_Seat;

    ArrayList<BusBooking> busBooking = new ArrayList<BusBooking>();
  
    public BusBooking(int CustomerID, int BusID, int RouteID, int PickupStopID, int DropStopID, String BookingTime, String TravelDate, String ReturnDate, String TicketType, int Total_Seat) {
        BookingID = ++Booking;
        this.CustomerID = CustomerID;
        this.BusID = BusID;
        this.RouteID = RouteID;
        this.PickupStopID = PickupStopID;
        this.DropStopID = DropStopID;
        this.BookingTime = BookingTime;
        this.TravelDate = TravelDate;
        this.ReturnDate = ReturnDate;
        this.TicketType = TicketType;
        this.Total_Seat = Total_Seat;
    }

    public BusBooking(int CustomerID, int BusID, int RouteID, int PickupStopID, int DropStopID, String BookingTime, String TravelDate, String TicketType, int Total_Seat) {
        BookingID = BookingID + 1;
        this.CustomerID = CustomerID;
        this.BusID = BusID;
        this.RouteID = RouteID;
        this.PickupStopID = PickupStopID;
        this.DropStopID = DropStopID;
        this.BookingTime = BookingTime;
        this.TravelDate = TravelDate;
        this.TicketType = TicketType;
        this.Total_Seat = Total_Seat;
    
    }
  
    
    public int getBookingID() {
        return BookingID;
    }

    
    public int getCustomerID() {
        return CustomerID;
    }

    
    public int getBusID() {
        return BusID;
    }

    
    public int getRouteID() {
        return RouteID;
    }

    
    public int getPickupStopID() {
        return PickupStopID;
    }

    
    public int getDropStopID() {
        return DropStopID;
    }

    
    public String getBookingTime() {
        return BookingTime;
    }

    
    public String getTravelDate() {
        return TravelDate;
    }

    
    public String getReturnDate() {
        return ReturnDate;
    }

    
    public String getTicketType() {
        return TicketType;
    }

    
    public int getTotal_Seat() {
        return Total_Seat;
    }
    @Override
    public boolean BookTicket() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean CancelTicket() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (obj instanceof BusBooking) {
            BusBooking busBooking = (BusBooking) obj;
            if (this.BookingID == busBooking.BookingID) {
                return true;
            }
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "BusBooking \nBookingID=" + BookingID + ", \nCustomerID=" + CustomerID + ", \nBusID=" + BusID + ", \nRouteID="
                + RouteID + ", \nPickupStopID=" + PickupStopID + ", \nDropStopID=" + DropStopID + ", \nBookingTime="
                + BookingTime + ", \nTravelDate=" + TravelDate + ", \nReturnDate=" + ReturnDate + ", \nTicketType="
                + TicketType + ", \nTotal_Seat=" + Total_Seat;
    }

    
    
}
