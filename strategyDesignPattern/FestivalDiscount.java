// FestivalDiscount.java
public class FestivalDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.80; // 20% discount
    }
}
