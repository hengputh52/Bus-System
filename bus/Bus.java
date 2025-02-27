package bus;


public class Bus {
    
    public static void main(String[] args) {
    try{
        BusBooking bus1 = new BusBooking(1, 1, 1, 1, 1, "10:00", "2021-10-10", "2021-10-11", 2);
        BusBooking bus2 = new BusBooking(2, 2, 2, 2, 2, "11:00", "2021-10-10", 2);
    

        System.out.println(bus1);
        System.out.println(bus2);

    }    
    catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
       
    }    
    finally{
        System.out.println("Thank you for using our service");
    }

}
}
