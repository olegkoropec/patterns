package state;

public class OnlineMode implements State {
    @Override
    public void action(Phone phone) {
        System.out.println("Online");
        phone.setState(this);
    }

    @Override
    public String toString() {
        return "OnlineMode";
    }
}
