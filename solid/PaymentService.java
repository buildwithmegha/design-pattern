interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPIPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class PaymentService {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
