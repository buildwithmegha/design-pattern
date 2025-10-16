// RegularCustomerDiscount.java
public class RegularCustomerDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.95; // 5% discount
    }
}
