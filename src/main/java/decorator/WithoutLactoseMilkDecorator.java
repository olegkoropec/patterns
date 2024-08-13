package decorator;

public class WithoutLactoseMilkDecorator implements Coffee {

    private Coffee espresso;

    public WithoutLactoseMilkDecorator(Coffee espresso) {
        this.espresso = espresso;
    }

    @Override
    public int price() {
        return espresso.price() + 30;
    }

    @Override
    public String name() {
        return espresso.name() + " with non lactose milk";
    }
}
