package bus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadBusBooking {
    public static void main(String[] args) {
        readFromFile("data.txt");
    }

    // Method to read booking details from a file
    private static void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Booking Details from File:");
            System.out.println("=====================================");
            
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("=====================================");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
