package decorator;

public class SugarDecorator implements Coffee {
    private Coffee espresso;

    public SugarDecorator(Coffee espresso) {
        this.espresso = espresso;
    }

    @Override
    public int price() {
        return espresso.price() + 2;
    }

    @Override
    public String name() {
        return espresso.name() + " with sugar!";
    }
}
