package bus;
public interface Booking {
    int getBookingID();
    int getCustomerID();
    int getBusID();
    int getRouteID();
    int getPickupStopID();
    int getDropStopID();
    String getBookingTime();
    String getTravelDate();
    String getReturnDate();
    String getTicketType();
    int getTotal_Seat();

}
