public class PremiumPayment extends Payment {
    private double discount;

    // Constructor
    public PremiumPayment(double amount, String paymentMethod, double discount) throws InvalidPaymentException {
        super(amount, paymentMethod);  // Call the constructor of the parent Payment class
        if (discount < 0 || discount > 100) {
            throw InvalidPaymentException.invalidDiscount();
        }
        this.discount = discount;
    }

    // Overridden method to process payment with a discount
    @Override
    public void processPayment(double amount) throws InvalidPaymentException {
        if (amount <= 0) {
            throw InvalidPaymentException.invalidAmount();
        }
        double discountedAmount = amount - (amount * discount / 100);
        System.out.println("Processing premium payment with " + discount + "% discount. Final amount: $" + discountedAmount + " via " + getPaymentMethod());
    }

    // Overridden method to cancel payment
    @Override
    public void cancelPayment() {
        System.out.println("Premium payment of $" + getAmount() + " has been cancelled. Discount will not apply on recharges.");
    }

    // Overridden toString method to display payment details including discount
    @Override
    public String toString() {
        return super.toString() + ", discount=" + discount + "%";
    }

    // Getters and setters for the discount if needed
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) throws InvalidPaymentException {
        if (discount < 0 || discount > 100) {
            throw InvalidPaymentException.invalidDiscount();
        }
        this.discount = discount;
    }
}
