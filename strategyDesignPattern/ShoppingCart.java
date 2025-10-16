// ShoppingCart.java
public class ShoppingCart {
    private DiscountStrategy discountStrategy; // Composition

    // Strategy can be changed at runtime
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void checkout(double amount) {
        if (discountStrategy == null) {
            System.out.println("No discount applied. Final amount: " + amount);
        } else {
            double finalAmount = discountStrategy.applyDiscount(amount);
            System.out.println("Final amount after discount: " + finalAmount);
        }
    }
}
