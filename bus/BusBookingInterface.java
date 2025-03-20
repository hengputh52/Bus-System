package bus;

public interface BusBookingInterface {
    void bookTicket(int busID, String destination, String travelDate);
    void cancelBooking(int bookingID);
    void viewBookingHistory();
}
