package observer;

public class ObserverMain {
    public static void main(String[] args) {

        ObserverController observerController = new ObserverController();

        Observer telegram1 = new Telegram("t1");
        Observer telegram2 = new Telegram("t2");

        observerController.add(telegram1);
        observerController.add(telegram2);

        observerController.notifyObserver();
    }
}
