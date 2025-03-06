import java.util.ArrayList;
import java.util.Objects;
packa
// Customer class implementing Authenticates and BusBookingInterface
public class Customer implements Authenticates, BusBookingInterface {
    protected int customerID;
    protected String username;
    protected String email;
    protected String password;
    protected int age;
    protected String gender;
    protected String phoneNumber;
    protected String address;
    
    private static int customerCount = 0;
    private static ArrayList<Customer> customerList = new ArrayList<>();
    private ArrayList<String> bookingHistory = new ArrayList<>();

    // Constructor
    public Customer(String fullName, int age, String gender, String phone, String email, String address, String password) {
        if (email == null || email.isEmpty()) {
            throw new CustomerAlreadyExistsException("Email cannot be empty");
        }
        for (Customer customer : customerList) {
            if (customer.email.equals(email)) {
                throw new CustomerAlreadyExistsException(email);
            }
        }
        this.customerID = ++customerCount;
        this.username = fullName;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phone;
        this.address = address;
        this.password = password;
        customerList.add(this);
    }

    // Implementing Authenticates Methods
    @Override
    public void register(String username, String password) {
        try {
            if (username == null || password == null) {
                throw new InvalidCustomerDataException("Username or password cannot be null");
            }
            this.username = username;
            this.password = password;
            System.out.println("User registered successfully.");
        } catch (InvalidCustomerDataException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean login(String username, String password) {
        try {
            if (this.username.equals(username) && this.password.equals(password)) {
                System.out.println("Login successful for " + username);
                return true;
            }
            throw new InvalidLoginException();
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
            return false;
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
