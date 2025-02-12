package bus;

interface SeatsInfo{
    void displaySeatInfo();
    void bookSeat(String bookingID);
}

public class Seats implements SeatsInfo{
    
    String seatID;
    String bookingID;
    static String seatNumber;
    String seatType;
    double price;

    String[] SeatsFeatures;
    static String[] seatNumbers = {"A1","A2","A3","A4","A5","B1","B2","B3","B4","B5"};
    
    //Constructor

    Seats(String seatID, String seatNumber, String seatType, String bookingID, double price,String[] SeatsFeatures ){

        this.seatID = seatID;
        Seats.seatNumber = seatNumber;
        this.seatType = seatType;
        this.price = price;
        this.bookingID = bookingID;
        this.SeatsFeatures = SeatsFeatures;
    }@Override

    public void displaySeatInfo(){
        System.out.println("Seat ID: " + seatID);
        System.out.println("Seat Number: "+ seatNumber );
        System.out.println("Seat Type: " + seatType);
        System.out.println("Price: "+ price);
        System.out.println("Booking ID: " + bookingID);
        System.out.println("Seat features: ");
        for(String feature: SeatsFeatures){
            System.out.println(" - " + feature);
        }
    }
   
    public void bookSeat(String bookingID){
        if (this.bookingID == null) {
            this.bookingID = bookingID;
            System.out.println("Seat" + seatNumber + "booked succesfully!");
        }
        else{
            System.out.println("Seat" + seatNumber + "is already booked.");
        }
    }

    public void displayAvailableSeats(){
        System.out.println("Available Seats: ");
        for(String seat :  seatNumbers){
            System.out.println(seat);
        }
    }

    public static void main(String[] args){
        String[] features = {"Reclining","USB Port","Extra Legroom"};
        Seats seat1 = new Seats("S01","A1","Premium",null,70.0,features);
        Seats seat2 = new Seats("S02","A2","Standard",null,50.0,features);
       

        seat1.displaySeatInfo();
        seat1.bookSeat("B123");

        seat2.displaySeatInfo();
        seat2.bookSeat("B456");

        seat1.displayAvailableSeats();

    }


}
