package bus;
public class Payment {
    // Private fields for payment information
    private String paymentID;
    private String bookingID;
    private double paymentAmount;
    private String paymentMethod;

    // Constructor to initialize payment details
    public Payment(String paymentID, String bookingID, double paymentAmount, String paymentMethod) {
        this.paymentID = paymentID;
        this.bookingID = bookingID;
        this.paymentAmount = paymentAmount;
        this.paymentMethod = paymentMethod;
    }

    // Getters and Setters
    public String getPaymentID() {
        return paymentID;
    }

    public String getBookingID() {
        return bookingID;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    // Method to process payment (prints out the details)
    public void processPayment() {
        System.out.println("Processing payment of " + paymentAmount + " using " + paymentMethod);
    }

    // Override toString() to return payment details
    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentID + '\'' +
                ", bookingID='" + bookingID + '\'' +
                ", paymentAmount=" + paymentAmount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
