package decorator;

public class Espresso implements Coffee {
    @Override
    public int price() {
        return 25;
    }

    @Override
    public String name() {
        return "Espresso";
    }
}
