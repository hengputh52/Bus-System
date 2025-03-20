package bus;
import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.Color;
public class Bus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer customer = null; // Initialize customer as null
    
        while (true) {
            System.out.println("1. Sign Up");
            System.out.println("2. Log In");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
    
            int choice;
            try {
                choice = input.nextInt();
                input.nextLine(); // Consume the newline character
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                input.nextLine(); // Clear the invalid input
                continue;
            }
    
            switch (choice) {
                case 1: // Sign Up
                    customer = new Customer("newUser", 25, 'M', "1234567890", "newuser@example.com", "123 Main St", "password123");
                    customer.signUp();
                    break;
    
                case 2: // Log In
                    System.out.print("Enter email: ");
                    String username = input.nextLine();
                    System.out.print("Enter password: ");
                    String password = input.nextLine();
    
                    // Call the login method
                    if (customer != null && customer.login(username, password)) {
                        System.out.println("Login successful!");
                    } else {
                        System.out.println("Login failed. Please try again.");
                        continue;
                    }
                    break;
    
                case 3: // Exit
                    System.out.println("Exiting now...");
                    input.close();
                    return;
    
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
    
            // After login or sign-up, allow the user to make a booking
            if (customer != null) {
                System.out.println("1. Make a Booking");
                System.out.println("2. Cancel Booking");
                System.out.println("3. View Booking History");
                System.out.println("4. Logout");
                System.out.print("Enter your choice: ");
    
                int option;
                try {
                    option = input.nextInt();
                    input.nextLine(); // Consume the newline character
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    input.nextLine(); // Clear the invalid input
                    continue;
                }
    
                switch (option) {
                    case 1: // Make a Booking
                        customer.BookTicket();
                        break;
    
                    case 2: // Cancel Booking
                        try {
                            System.out.print("Enter Booking ID to cancel: ");
                            int bookingID = input.nextInt();
                            input.nextLine(); // Consume the newline character
                            customer.CancelBooking(customer.getCustomerID(), bookingID);
                        } catch (Exception e) {
                            System.out.println("Invalid input. Please enter a valid Booking ID.");
                            input.nextLine(); // Clear the invalid input
                        }
                        break;
    
                    case 3: // View Booking History
                        customer.ViewHistory();
                        break;
    
                    case 4: // Logout
                        System.out.println("Logging out...");
                        customer = null; // Reset the customer object
                        break;
    
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
    
} 