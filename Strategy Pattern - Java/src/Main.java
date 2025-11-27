public class Main {
    public static void main(String[] args) {
        PaymentContext pc = new PaymentContext();

        PaymentStrategy b = new BkashPayment();
        PaymentStrategy c = new CreditCardPayment();
        PaymentStrategy p = new PayPalPayment();

        pc.setPaymentStrategy(b);
        pc.checkout(550);

        pc.setPaymentStrategy(c);
        pc.checkout(100);

        pc.setPaymentStrategy(p);
        pc.checkout(200);
    }
}