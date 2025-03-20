package bus;
public class InvalidPaymentException extends Exception {
    
    // Constructor with custom message
    public InvalidPaymentException(String message) {
        super(message);
    }

    // Static method for invalid amount exception
    public static InvalidPaymentException invalidAmount() {
        return new InvalidPaymentException("Error: Invalid payment amount. Amount must be greater than zero.");
    }

    // Static method for invalid payment method exception
    public static InvalidPaymentException invalidPaymentMethod() {
        return new InvalidPaymentException("Error: Invalid payment method. Payment method cannot be null or empty.");
    }

    // Static method for invalid discount exception
    public static InvalidPaymentException invalidDiscount() {
        return new InvalidPaymentException("Error: Discount must be between 0% and 100%.");
    }
}
