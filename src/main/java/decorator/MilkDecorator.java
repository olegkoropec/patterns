package decorator;

public class MilkDecorator implements Coffee {
    private Coffee espresso;

    public MilkDecorator(Coffee espresso) {
        this.espresso = espresso;
    }

    @Override
    public int price() {
        return espresso.price() + 20;
    }

    @Override
    public String name() {
        return espresso.name() + " with milk";
    }
}
