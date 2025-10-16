// StudentDiscount.java
public class StudentDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.90; // 10% discount
    }
}
