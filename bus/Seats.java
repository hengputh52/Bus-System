package bus;

import java.util.ArrayList;
import java.util.Scanner;

interface SeatsInfo {
    void displaySeatInfo();
    void bookSeat(String bookingID);
}

public class Seats implements SeatsInfo {
    String seatID;
    String bookingID;
    static String seatNumber; 
    String seatType;
    double price;

    String[] seatFeatures; 
    static ArrayList<String> availableSeats = new ArrayList<>(); 

    // Constructor
    Seats(String seatID, String seatType, String bookingID, double price, String[] seatFeatures) {
        this.seatID = seatID;
        this.seatType = seatType;
        this.price = price;
        this.bookingID = bookingID;
        this.seatFeatures = seatFeatures;
    }

    @Override
    public void displaySeatInfo() {
        System.out.println("\nSeat Information:");
        System.out.println("Seat ID: " + seatID);
        System.out.println("Seat Number: " + Seats.seatNumber); 
        System.out.println("Seat Type: " + seatType);
        System.out.println("Price: " + price);
        System.out.println("Booking ID: " + bookingID);
        System.out.println("Seat features: ");
        for (String feature : seatFeatures) {
            System.out.println(" - " + feature);
        }
    }

    @Override
    public void bookSeat(String bookingID) {
        if (this.bookingID == null) {
            this.bookingID = bookingID;
            availableSeats.remove(Seats.seatNumber); 
            System.out.println("Seat " + Seats.seatNumber + " booked successfully!");
        } else {
            System.out.println("Seat " + Seats.seatNumber + " is already booked.");
        }
    }

    public static void displayAvailableSeats() {
        System.out.println("\nAvailable Seats: ");
        for (String seat : availableSeats) {
            System.out.println(seat);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Seats> seatsList = new ArrayList<>(); 

        // Initialize available seats
        availableSeats.add("A1");
        availableSeats.add("A2");
        availableSeats.add("A3");
        availableSeats.add("A4");
        availableSeats.add("A5");
        availableSeats.add("B1");
        availableSeats.add("B2");
        availableSeats.add("B3");
        availableSeats.add("B4");
        availableSeats.add("B5");

        while (true) {
           
            System.out.println("\n Enter Seat Details (or type 'exit' to finish):");
            System.out.print("Seat ID: ");
            String seatID = scanner.nextLine();

            if (seatID.equalsIgnoreCase("exit")) {
                break; 
            }

            System.out.print("Seat Number: ");
            Seats.seatNumber = scanner.nextLine(); 

            if (!availableSeats.contains(Seats.seatNumber)) {
                System.out.println("Seat " + Seats.seatNumber + " is not available.");
                continue; 
            }

            System.out.print("Seat Type: ");
            String seatType = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Enter seat features (comma-separated, e.g., Reclining,USB Port,Extra Legroom): ");
            String featuresInput = scanner.nextLine();
            String[] seatFeatures = featuresInput.split(",");

            Seats seat = new Seats(seatID, seatType, null, price, seatFeatures);
            seatsList.add(seat);

            seat.displaySeatInfo();

           

            System.out.print("\nEnter Booking ID to book the seat: ");
            String bookingID = scanner.nextLine();
            seat.bookSeat(bookingID);

            seat.displaySeatInfo();
            displayAvailableSeats();

        }

        System.out.println("\nAll Seats:");
        for (Seats seat : seatsList) {
            seat.displaySeatInfo();
        }

        scanner.close();
    }
}