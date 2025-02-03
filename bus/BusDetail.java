package bus;

public class BusDetail {
    String BusID;
    String BusNumber;
    String BusType;
    int TotalSeat;

    public BusDetail(String busID, String busNumber, String busType, int totalSeat) {
        BusID = busID;
        BusNumber = busNumber;
        BusType = busType;
        TotalSeat = totalSeat;
    }
}
