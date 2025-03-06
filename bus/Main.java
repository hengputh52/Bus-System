package bus;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Collect customer details
        System.out.println("Enter details for the customer:");

        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Gender: ");
        String gender = scanner.nextLine();

        System.out.print("Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        // Create a new customer object
        Customer customer = null;
        try {
            customer = new Customer(fullName, age, gender, phone, email, address, password);
            System.out.println("Customer created successfully.");
        } catch (CustomerException e) {
            System.out.println(e.getMessage());
        }

        // Write customer data to a text file
        if (customer != null) {
            File file = new File("customers_data.txt");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                // Write customer details
                writer.write(customer.toString() + "\n");
                System.out.println("Customer data saved to 'customers_data.txt'.");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        }

        // Close the scanner
        scanner.close();
    }
}
