package bus;
// Base Exception for Customer-related errors
public class CustomerException extends RuntimeException {
    public CustomerException(String message) {
        super(message);
    }
}

// Exception when a customer already exists
class CustomerAlreadyExistsException extends CustomerException {
    public CustomerAlreadyExistsException(String email) {
        super("A customer with email " + email + " already exists.");
    }
}

// Exception for invalid login credentials
class InvalidLoginException extends CustomerException {
    public InvalidLoginException() {
        super("Invalid login credentials. Please check your username or password.");
    }
}

// Exception for invalid customer data
class InvalidCustomerDataException extends CustomerException {
    public InvalidCustomerDataException(String message) {
        super("Invalid customer data: " + message);
    }
}
