package bus;

public class BusDetail {
    static int BusID;
    String BusNumber;
    String BusType;
    int TotalSeat;

    public BusDetail(int BusID, String busNumber, String busType, int totalSeat) {
        BusID = BusID + 1;
        BusNumber = busNumber;
        BusType = busType;
        TotalSeat = totalSeat;
    }
}
