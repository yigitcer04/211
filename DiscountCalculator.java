public class DiscountCalculator {

    public double calculateDiscount(double totalAmount) {
        if (totalAmount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        if (totalAmount < 50) {
            return totalAmount;
        } else if (totalAmount <= 100) {
            return totalAmount * 0.9;
        } else {
            return totalAmount * 0.8;
        }
    }
}
