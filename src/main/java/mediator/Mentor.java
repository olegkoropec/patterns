package mediator;

public class Mentor extends User {
    public Mentor(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String text) {
        System.out.println("Mentor received: " + text);
    }
}
