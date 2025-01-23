package bus;
public class Bus {
    public static void main(String[] args) {
        
        /*Register b = new Register();
        System.out.println("Full Name: " + b.FullName);

        Register c = new Register("john", 12, "female", "1234567890", "1234");
        System.out.println("Full Name: " + c.FullName + "\nAge: " + c.Age + "\ngender: " + c.Gender + "\nTelephone: " + c.Telephone + "\nAddress: " + c.Address);

        BusBooking a = new BusBooking();    
        System.out.println("Bus Destination: " + a.Destination);
        */
        System.out.println("Welcome to Sabay Bus Ticket");
        

        do {
            System.out.println("1. Register");
            System.out.println("2. Book Ticket");
            System.out.println("3. Display Ticket");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = 0;
            switch (choice) {
                case 1:
                    Register a = new Register();
                    break;
                case 2:
                    BusBooking b = new BusBooking();
                    break;
                case 3:
                    
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 5);





    }    

}
