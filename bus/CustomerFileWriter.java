package bus;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CustomerFileWriter {

    // Method to add a customer to the file
    public void addCustomerToFile(String filename, String customerData) {
        File file = new File(filename);
        
        // Append customer data to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(customerData);  // Write the customer data
            writer.newLine();  // Add a new line after each customer entry
            System.out.println("Customer data added successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create an instance of CustomerFileWriter
        CustomerFileWriter customerFileWriter = new CustomerFileWriter();

        // Prompt for customer details
        System.out.println("Enter customer details:");
        
        System.out.print("Enter customer ID: ");
        int customerID = scanner.nextInt();
        scanner.nextLine();  // Consume the newline left by nextInt()

        System.out.print("Enter customer name: ");
        String username = scanner.nextLine();

        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();

        System.out.print("Enter customer phone number: ");
        String phoneNumber = scanner.nextLine();

        // Creating the customer data in a specific format
        String customerData = "Customer{ID=" + customerID + ", Username='" + username + "', Email='" + email + "', Phone='" + phoneNumber + "'}";

        // Call the method to add the customer data to the new file
        customerFileWriter.addCustomerToFile("new_customers_data.txt", customerData);
        
        scanner.close();  // Close the scanner
    }
}
