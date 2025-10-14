package PaymentSystemInterface;

public class PayPal implements Payable, Refundable{
    @Override
    public void pay(double amount) {
        System.out.println("Paypal  payment is $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Paypal refund is $" + amount);
    }
}
