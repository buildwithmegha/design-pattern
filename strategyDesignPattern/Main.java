// Main.java
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        double amount = 1000.0;

        //  Regular customer
        cart.setDiscountStrategy(new RegularCustomerDiscount());
        cart.checkout(amount);

        //  Student customer
        cart.setDiscountStrategy(new StudentDiscount());
        cart.checkout(amount);

        //  Festival offer
        cart.setDiscountStrategy(new FestivalDiscount());
        cart.checkout(amount);

        //  No discount case
        cart.setDiscountStrategy(null);
        cart.checkout(amount);
    }
}
