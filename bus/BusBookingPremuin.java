package bus;

public class BusBookingPremuin extends BusBooking{
    private String vipServices;
    public BusBookingPremuin(int CustomerID, int BusID, int RouteID, int PickupStopID, int DropStopID, String BookingTime, String TravelDate, String ReturnDate, int Total_Seat, String vipServices) {
        super(CustomerID, BusID, RouteID, PickupStopID, DropStopID, BookingTime, TravelDate, ReturnDate, Total_Seat);
        if (Total_Seat > 20 || Total_Seat < 0) {
            throw new IllegalArgumentException("Total seat must be more than 0 and less than 20");
        }
        
        this.vipServices = vipServices;
    }
    public BusBookingPremuin(int CustomerID, int BusID, int RouteID, int PickupStopID, int DropStopID, String BookingTime, String TravelDate, int Total_Seat, String vipServices) {
        super(CustomerID, BusID, RouteID, PickupStopID, DropStopID, BookingTime, TravelDate, Total_Seat);
        this.vipServices = vipServices;
    }
    protected String getVipServices() {
        return vipServices;
    }

}
