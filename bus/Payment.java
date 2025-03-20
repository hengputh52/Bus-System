package bus;
public class Payment implements Pay {
    private static int transactionCount = 0;
    private double amount;
    private String paymentMethod;
    private int transactionID;

    // Constructor
    public Payment(double amount, String paymentMethod) throws InvalidPaymentException {
        if (amount <= 0) {
            throw InvalidPaymentException.invalidAmount();
        }
        if (paymentMethod == null || paymentMethod.isEmpty()) {
            throw InvalidPaymentException.invalidPaymentMethod();
        }
        
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.transactionID = ++transactionCount; // Unique transaction ID
    }

    // Method to process payment
    @Override
    public void processPayment(double amount) throws InvalidPaymentException {
        if (amount <= 0) {
            throw InvalidPaymentException.invalidAmount();
        }
        System.out.println("Processing payment of amount: $" + amount + " via " + paymentMethod);
    }

    // Method to cancel payment
    @Override
    public void cancelPayment() {
        System.out.println("Payment of $" + amount + " has been cancelled.");
    }

    // Getter methods for amount and paymentMethod
    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    // toString method to display payment details
    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", transactionID=" + transactionID +
                '}';
    }
}
