package bus;

import java.util.ArrayList;

public class BusBooking implements Booking {
    private static int Booking = 0;  
    private int BookingID;
    private int CustomerID; 
    private int PickupStopID;
    private int DropStopID;
    private String TravelDate;
    private String ReturnDate;
    private int Total_Seat;

   static ArrayList<BusBooking> busBooking = new ArrayList<BusBooking>();
  
    public BusBooking(int CustomerID, int BusID, int RouteID, int PickupStopID, int DropStopID, String BookingTime, String TravelDate, String ReturnDate, int Total_Seat){
        this.BookingID = ++Booking;
        this.CustomerID = CustomerID;
        this.PickupStopID = PickupStopID;
        this.DropStopID = DropStopID;
        this.TravelDate = TravelDate;
        this.ReturnDate = ReturnDate;
        this.Total_Seat = Total_Seat;
        busBooking.add(this);
    }


    public BusBooking(int CustomerID, int BusID, int RouteID, int PickupStopID, int DropStopID, String BookingTime, String TravelDate, int Total_Seat) {
        this.BookingID = ++Booking;
        this.CustomerID = CustomerID;
        this.BusID = BusID;
        this.RouteID = RouteID;
        this.PickupStopID = PickupStopID;
        this.DropStopID = DropStopID;
        this.BookingTime = BookingTime;
        this.TravelDate = TravelDate;
        this.Total_Seat = Total_Seat;
        busBooking.add(this);
    
    }
  
    
    protected int getBookingID() {
        return BookingID;
    }

    
    protected int getCustomerID() {
        return CustomerID;
    }

    
    protected int getBusID() {
        return BusID;
    }

    
    protected int getRouteID() {
        return RouteID;
    }

    
    protected int getPickupStopID() {
        return PickupStopID;
    }

    
    protected int getDropStopID() {
        return DropStopID;
    }

    
    protected String getBookingTime() {
        return BookingTime;
    }

    
    protected String getTravelDate() {
        return TravelDate;
    }

    
    protected String getReturnDate() {
        return ReturnDate;
    }


    
    protected int getTotal_Seat() {
        return Total_Seat;
    }

    protected static ArrayList<BusBooking> getBusBooking() {
        return busBooking;
    }
    @Override
    public void BookTicket() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean CancelTicket(int bookingID, int customerID) {
        // TODO Auto-generated method stub
        for (BusBooking booking : busBooking) {
            if (booking.getBookingID() == bookingID && booking.getCustomerID() == customerID) {
                busBooking.remove(bookingID);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (obj instanceof BusBooking) {
            BusBooking busBooking = (BusBooking) obj;
            if (this.BookingID == busBooking.BookingID && this.CustomerID == busBooking.CustomerID) {
                return true;
            }
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "BusBooking \nBookingID=" + BookingID + ", \nCustomerID=" + CustomerID + ", \nRouteID="
                + ", \nPickupStopID=" + PickupStopID + ", \nDropStopID=" + DropStopID + ", \nBookingTime="
                + "\nTravelDate=" + TravelDate + ", \nReturnDate=" + ReturnDate + ", \nTotal_Seat=" + Total_Seat;
    }

    
    
}

