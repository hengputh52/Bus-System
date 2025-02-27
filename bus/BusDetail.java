package bus;

import java.util.ArrayList;

public class BusDetail {
    private static int BusCount = 0;
    private int BusID;
    private String BusNumber;
    private int TotalSeat;

    static ArrayList<BusDetail> busDetail = new ArrayList<BusDetail>();

    public BusDetail(String busNumber,int totalSeat) {
        this.BusID = ++BusCount;
        this.BusNumber = busNumber;
        this.TotalSeat = totalSeat;
    }



    protected int getBusID() {
        return BusID;
    }

    protected String getBusNumber() {
        return BusNumber;
    }

   

    protected int getTotalSeat() {
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
