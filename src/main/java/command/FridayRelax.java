package command;

public class FridayRelax implements Command {

    private Beer beer;
    private Fish fish;
    private TV tv;

    public FridayRelax(Beer beer, Fish fish, TV tv) {
        this.beer = beer;
        this.fish = fish;
        this.tv = tv;
    }

    @Override
    public void execute() {
        beer.open();
        fish.eat();
        tv.turnOn();
    }
}
