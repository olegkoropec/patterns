package strategy;

public class BinancePayment implements PaymentStrategy {
    private String personalId;
    private String name;

    public BinancePayment(String personalId, String name) {
        this.personalId = personalId;
        this.name = name;
    }

    @Override
    public void pay(int amount) {
        System.out.println(String.format("%d paid by Binance", amount));
    }
}
