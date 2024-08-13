package mediator;

public abstract class User {

    private Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String msg) {
        mediator.send(msg, this);
    }

    public abstract void receive(String text);
}
