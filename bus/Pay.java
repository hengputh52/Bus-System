package bus;
public interface Pay {
    // Method to process the payment
    void processPayment(double amount) throws InvalidPaymentException;

    // Method to cancel the payment
    void cancelPayment();
}
