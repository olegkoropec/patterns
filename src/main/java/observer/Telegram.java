package observer;

public class Telegram implements Observer {

    private String name;

    public Telegram(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(String.format("%s received message!", message));
    }
}
