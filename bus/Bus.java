package bus;
public class Bus {
    public static void main(String[] args) {
        
       BusBooking b1 = new BusBooking(1, 1, 1, 1, 1, "10:00", "2021-10-10", "2021-10-11", "AC", 50);    
        System.out.println(b1.toString());
        BusBooking b2 = new BusBooking(2, 2, 2, 2, 2, "11:00", "2021-10-10", "2021-10-11", "NON-AC", 50);
        System.out.println(b2.equals(b1));

    }    

}
