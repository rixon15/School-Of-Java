package PaymentSystemInterface;

public class CreditCard implements Payable, Refundable{
    @Override
    public void pay(double amount) {
        System.out.println("Credit card payment is $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Credit card refund is $" + amount);
    }
}
