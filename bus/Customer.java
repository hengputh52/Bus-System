
package bus;
import java.util.ArrayList;

interface CustomerOperations {
    void registerCustomer(String customerID, String fullName, String email, String phoneNumber, int age, String password);
    boolean loginCustomer(String customerID, String password);
}

public class Customer implements CustomerOperations {
    // Private fields for customer information
    private String customerID;
    private String fullName;
    private String email;
    private String phoneNumber;
    private int age;
    private String password;

    // Static list to store all customers
    private static ArrayList<Customer> customersList = new ArrayList<>();

    // Constructor to initialize customer details
    public Customer(String customerID, String fullName, String email, String phoneNumber, int age, String password) {
        this.customerID = customerID;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.password = password;
    }

    // Static method to register a new customer
    @Override
    public void registerCustomer(String customerID, String fullName, String email, String phoneNumber, int age, String password) {
        for (Customer customer : customersList) {
            if (customer.getCustomerID().equals(customerID)) {
                System.out.println("Customer with ID " + customerID + " already exists.");
                return;  // Exit if the customer already exists
            }
        }

        // Create a new customer and add to the list
        Customer newCustomer = new Customer(customerID, fullName, email, phoneNumber, age, password);
        customersList.add(newCustomer);
        System.out.println("Customer registered: " + newCustomer);
    }

    // Static method to login a customer by customerID and password
    @Override
    public boolean loginCustomer(String customerID, String password) {
        for (Customer customer : customersList) {
            if (customer.getCustomerID().equals(customerID) && customer.getPassword().equals(password)) {
                System.out.println("Login successful: " + customer);
                return true;
            }
        }
        System.out.println("Invalid customerID or password.");
        return false;  // Login failed
    }

    // Getters and Setters
    public String getCustomerID() {
        return customerID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    // Override equals() to compare customers by customerID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Customer customer = (Customer) obj;
        return customerID.equals(customer.customerID);
    }

    // Override toString() to return customer details
    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
