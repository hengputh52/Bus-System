package bus;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CustomerReader {
    

    // Method to read and display customer data from a file
    public void readCustomerDataFromFile(String filename) {
        File file = new File(filename);
        
        // Check if file exists
        if (!file.exists()) {
            System.out.println("File not found: " + filename);
            return;
        }

        // Read the file content
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Display each line of the file
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create an instance of CustomerReader
        CustomerReader customerReader = new CustomerReader();
        
        // Call the method to read data from the file
        customerReader.readCustomerDataFromFile("customers_data.txt");
    }
}
