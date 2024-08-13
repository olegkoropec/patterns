package state;

public class OfflineMode implements State {
    @Override
    public void action(Phone phone) {
        System.out.println("Offline");
        phone.setState(this);
    }

    @Override
    public String toString() {
        return "OfflineMode";
    }
}
