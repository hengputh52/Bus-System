package bus;

import java.util.ArrayList;

public class BusDetail {
    private static int BusCount = 0;
    private int BusID;
    private int totalSeat;
    private int availableSeat;

    static ArrayList<BusDetail> busDetail = new ArrayList<BusDetail>();

    public BusDetail(int totalSeat) {
        this.BusID = ++BusCount;
        this.totalSeat = totalSeat;
    }



    protected int getBusID() {
        return BusID;
    }

    

   

    protected int getTotalSeat() {
        return totalSeat;
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
