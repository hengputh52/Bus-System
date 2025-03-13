package bus;
import java.util.Scanner;

public class Bus {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter Customer ID: ");
            int CustomerID = input.nextInt();
            
            IntegerInputOnlyException n = new IntegerInputOnlyException(CustomerID);

            System.out.print("Enter Bus ID: ");
            int BusID = input.nextInt();
            input.nextLine(); // Consume the newline character
    

            System.out.print("Enter Route ID: ");
            int RouteID = input.nextInt();
            input.nextLine(); // Consume the newline character

            System.out.print("Enter Pickup Stop ID: ");
            int PickupStopID = input.nextInt();
            input.nextLine(); // Consume the newline character

            System.out.print("Enter Drop Stop ID: ");
            int DropStopID = input.nextInt();
            input.nextLine(); // Consume the newline character

            int[] inputInteger = {CustomerID,BusID,RouteID,PickupStopID,DropStopID};
            CheckStringEmpty i = new CheckStringEmpty(inputInteger);
        

            System.out.print("Enter Booking Time: ");
            String BookingTime = input.nextLine();
            

            System.out.print("Enter Travel Date: ");
            String TravelDate = input.nextLine();
            

            System.out.print("Enter Return Date: ");
            String ReturnDate = input.nextLine();

            String[] inputStrings = {BookingTime, TravelDate, ReturnDate};
            CheckStringEmpty cse = new CheckStringEmpty(inputStrings);

            System.out.print("Enter Total Seat: ");
            int Total_Seat = input.nextInt();
            BookingException be = new BookingException(Total_Seat);

            // Create a new BusBooking instance
            BusBooking booking = new BusBooking(CustomerID, BusID, RouteID, PickupStopID, DropStopID, BookingTime, TravelDate, ReturnDate, Total_Seat);
            System.out.println("Booking successful: " + booking);

        } catch (BookingException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
        
        catch (CheckStringEmpty e)
        {
            System.out.println(e.getMessage());
        }
        catch(IntegerInputOnlyException e)
        {
            System.out.println(e.getMessage());
        }
        
        finally {
            System.out.println("Thank you for using our service");
            input.close();
        }
    }
}