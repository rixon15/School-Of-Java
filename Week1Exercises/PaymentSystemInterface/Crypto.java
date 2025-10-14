package PaymentSystemInterface;

public class Crypto implements Payable, Refundable{
    @Override
    public void pay(double amount) {
        System.out.println("Crypto pay is $" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Crypto refund is $" + amount);
    }
}
