package bus;

import java.util.ArrayList;

public class BusDetail {
    private static int BusCount = 0;
    private int BusID;
    private String BusNumber;
    private int TotalSeat;

    static ArrayList<BusDetail> busDetail = new ArrayList<BusDetail>();

    public BusDetail(String busNumber,int totalSeat) {
        BusID = ++BusCount;
        BusNumber = busNumber;
        TotalSeat = totalSeat;
    }



    public int getBusID() {
        return BusID;
    }

    public String getBusNumber() {
        return BusNumber;
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
        return "BusDetail [BusID=" + BusID + ", BusNumber=" + BusNumber + ", TotalSeat="
                + TotalSeat + ", busDetail=" + busDetail + "]";
    }


}
