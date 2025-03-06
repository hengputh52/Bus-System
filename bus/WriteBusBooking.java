package bus;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteBusBooking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Get user input
            System.out.println("Enter Customer ID: ");
            int customerID = input.nextInt();
            input.nextLine(); // Consume newline
            IntegerInputOnlyException n = new IntegerInputOnlyException(customerID);

            System.out.println("Enter Bus ID: ");
            int busID = input.nextInt();
            input.nextLine();

            System.out.println("Enter Route ID: ");
            int routeID = input.nextInt();
            input.nextLine();

            System.out.println("Enter Pickup Stop ID: ");
            int pickupStopID = input.nextInt();
            input.nextLine();

            System.out.println("Enter Drop Stop ID: ");
            int dropStopID = input.nextInt();
            input.nextLine();

            System.out.println("Enter Booking Time: ");
            String bookingTime = input.nextLine();

            System.out.println("Enter Travel Date: ");
            String travelDate = input.nextLine();

            System.out.println("Enter Return Date: ");
            String returnDate = input.nextLine();

            String[] inputStrings = {bookingTime, travelDate, returnDate};
            CheckStringEmpty cse = new CheckStringEmpty(inputStrings);

            System.out.println("Enter Total Seat: ");
            int totalSeat = input.nextInt();
            input.nextLine(); // Consume newline
            BookingException be = new BookingException(totalSeat);
            // Validate input
           
            // Write data to file
            writeToFile(customerID, busID, routeID, pickupStopID, dropStopID, bookingTime, travelDate, returnDate, totalSeat);
            System.out.println("Booking successfully saved to file.");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File writing error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using our service.");
            input.close();
        }
    }

    // Method to write booking details to a file
    private static void writeToFile(int customerID, int busID, int routeID, int pickupStopID, int dropStopID, String bookingTime, String travelDate, String returnDate, int totalSeat) throws IOException {
        FileWriter writer = new FileWriter("data.txt", true); // Append mode enabled
        writer.write("Customer ID: " + customerID + "\n");
        writer.write("Bus ID: " + busID + "\n");
        writer.write("Route ID: " + routeID + "\n");
        writer.write("Pickup Stop ID: " + pickupStopID + "\n");
        writer.write("Drop Stop ID: " + dropStopID + "\n");
        writer.write("Booking Time: " + bookingTime + "\n");
        writer.write("Travel Date: " + travelDate + "\n");
        writer.write("Return Date: " + returnDate + "\n");
        writer.write("Total Seat: " + totalSeat + "\n");
        writer.write("-----------------------------\n");
        writer.close();
    }
}
