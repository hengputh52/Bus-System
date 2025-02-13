package bus;

public class BusVIP extends BusDetail {
    private String vipServices;

    public BusVIP(String busNumber, String busType, int totalSeat, String vipServices) {
        super(busNumber, busType, totalSeat);
        this.vipServices = vipServices;
    }

    public String getVipServices() {
        return vipServices;
    }

    public void setVipServices(String vipServices) {
        this.vipServices = vipServices;
    }

    @Override
    public String toString() {
        return "BusVIP [BusID=" + getBusID() + ", BusNumber=" + getBusNumber() + ", BusType=" + getBusType() + ", TotalSeat=" + getTotalSeat() + ", VIP Services=" + vipServices + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BusVIP) {
            BusVIP busVIP = (BusVIP) obj;
            return this.getBusID() == busVIP.getBusID();
        }
        return super.equals(obj);
    }
}