package PaymentSystemInterface;

public class Main {

    void main() {

        CreditCard creditCard = new CreditCard();
        PayPal paypal = new PayPal();
        Crypto crypto = new Crypto();

        processPayment(creditCard, 100);
        processPayment(paypal, 150);
        processPayment(crypto, 200);


    }

    void processPayment(Payable p, double amount) {

        p.pay(amount);

    }

}
