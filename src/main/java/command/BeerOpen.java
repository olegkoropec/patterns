package command;

public class BeerOpen implements Command {
    private Beer beer;

    public BeerOpen(Beer beer) {
        this.beer = beer;
    }

    @Override
    public void execute() {
        beer.open();
    }
}
