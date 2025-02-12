package bus;

import java.util.ArrayList;

public class BusDetail {
    private static int BusCount = 0;
    private int BusID;
    private String BusNumber;
    private String BusType;
    private int TotalSeat;

    ArrayList<BusDetail> busDetail = new ArrayList<BusDetail>();

    public BusDetail(String busNumber, String busType, int totalSeat) {
        BusID = ++BusCount;
        BusNumber = busNumber;
        BusType = busType;
        TotalSeat = totalSeat;
    }

    public static int getBusCount() {
        return BusCount;
    }

    public int getBusID() {
        return BusID;
    }

    public String getBusNumber() {
        return BusNumber;
    }

    public String getBusType() {
        return BusType;
    }

    public int getTotalSeat() {
        return TotalSeat;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (obj instanceof BusDetail) {
            BusDetail busDetail = (BusDetail) obj;
            return this.BusID == busDetail.BusID;
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "BusDetail [BusID=" + BusID + ", BusNumber=" + BusNumber + ", BusType=" + BusType + ", TotalSeat="
                + TotalSeat + ", busDetail=" + busDetail + "]";
    }


}
