package bus;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
// Customer class implementing Authenticates and BusBookingInterface
public class Customer implements Authenticates, Booking {
    protected int customerID;
    protected String username;
    protected String email;
    protected String password;
    protected int age;
    protected char gender;
    protected String phoneNumber;
    protected String address;
    
    private static int customerCount = 0;
    private static ArrayList<Customer> customerList = new ArrayList<>();
    private ArrayList<String> bookingHistory = new ArrayList<>();

    // Constructor
    public Customer(String username, int age, char gender, String phone, String email, String address, String password) {
        if (email == null || email.isEmpty()) {
            throw new CustomerAlreadyExistsException("Email cannot be empty");
        }
        for (Customer customer : customerList) {
            if (customer.email.equals(email)) {
                throw new CustomerAlreadyExistsException(email);
            }
        }
        this.customerID = ++customerCount;
        this.username = username;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phone;
        this.address = address;
        this.password = password;
        customerList.add(this);
    }


    protected static ArrayList<Customer> getCustomer()
    {
        return customerList;
    }

    @Override
public void signUp() {
    Scanner input = new Scanner(System.in);

    try {
        System.out.print("Enter your Username: ");
        String username = input.nextLine();
        if (username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty!");
        }

        int age;
        while (true) {
            System.out.print("Enter your Age: ");
            try {
                age = input.nextInt();
                input.nextLine(); // Consume the newline character
                if (age <= 0) {
                    System.out.println("Age must be a positive number. Please try again.");
                    continue;
                }
                break; // Valid age entered
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for age.");
                input.nextLine(); // Clear the invalid input
            }
        }

        System.out.print("Enter your Gender (M/F): ");
        char gender = input.next().charAt(0);
        input.nextLine();

        System.out.print("Enter your Phone Number: ");
        String phoneNumber = input.nextLine();
        if (phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be empty!");
        }

        String email;
        while (true) {
            System.out.print("Enter your Email: ");
            email = input.nextLine();
            if (email.isEmpty()) {
                System.out.println("Email cannot be empty!");
                continue;
            }

            // Check if the email already exists in the customer list
            boolean emailExists = false;
            for (Customer customer : customerList) {
                if (customer.email.equals(email)) {
                    emailExists = true;
                    break;
                }
            }

            if (emailExists) {
                System.out.println("This email is already registered. Please enter a different email.");
            } else {
                break; // Email is valid and not already used
            }
        }

        System.out.print("Enter your Address: ");
        String address = input.nextLine();
        if (address.isEmpty()) {
            throw new IllegalArgumentException("Address cannot be empty!");
        }

        System.out.print("Enter your Password: ");
        String password = input.nextLine();
        if (password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty!");
        }

        // Create a new Customer and add it to the list
        Customer newCustomer = new Customer(username, age, gender, phoneNumber, email, address, password);
        customerList.add(newCustomer);

        System.out.println("Sign-up successful for " + username);
    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
    } finally {
        System.out.println("Thank you");
    }
}

@Override
public boolean login(String username, String password) {
    try {
        for (Customer customer : customerList) {
            if (customer.username.equals(username) && customer.password.equals(password)) {
                System.out.println("Login successful for " + username);
                return true;
            }
        }
        throw new InvalidLoginException();
    } catch (InvalidLoginException e) {
        System.out.println("Error: Invalid username or password.");
        return false;
    } finally {
        System.out.println("Login attempt completed.");
    }
}


    // Implementing BusBookingInterface Methods
    @Override
    public void bookTicket(int busID, String destination, String travelDate) {
        try {
            if (busID <= 0 || destination == null || travelDate == null) {
                throw new InvalidCustomerDataException("Invalid booking details");
            }
            String bookingDetails = "Bus " + busID + " to " + destination + " on " + travelDate;
            bookingHistory.add(bookingDetails);
            System.out.println(username + " booked a ticket. " + bookingDetails);
        } catch (InvalidCustomerDataException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void cancelBooking(int bookingID) {
        if (bookingID >= 0 && bookingID < bookingHistory.size()) {
            System.out.println("Booking " + bookingID + " canceled for " + username);
            bookingHistory.remove(bookingID);
        } else {
            System.out.println("Booking ID not found.");
        }
    }

    @Override
    public void viewBookingHistory() {
        System.out.println("Booking History for " + username + ": " + bookingHistory);
    }

    // Logout method
    public void logout() {
        System.out.println(username + " has logged out.");
    }

    // toString method
    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + customerID +
                ", Username='" + username + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }



    // equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Customer customer = (Customer) obj;
        return customerID == customer.customerID &&
                Objects.equals(username, customer.username) &&
                Objects.equals(email, customer.email);
    }
}
