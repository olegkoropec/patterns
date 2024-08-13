package strategy;

public class StrategyMain {
    public static void main(String[] args) {
        ApplePayment applePayment = new ApplePayment();

        PayPalPayment payPalPayment = new PayPalPayment("mail");
        BinancePayment binancePayment = new BinancePayment("23e23", "name");

        applePayment.setPaymentStrategy(payPalPayment);

        applePayment.makePayment(12);

        applePayment.setPaymentStrategy(binancePayment);

        applePayment.makePayment(20);


    }
}
