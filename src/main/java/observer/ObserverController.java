package observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverController {

    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void delete(Observer observer) {
        observers.remove(observer);
    }

    public void sendMsgToObservers(String msg) {
        observers.forEach(o -> o.update(msg));
    }

    public void notifyObserver() {
        System.out.println("task started!");
        sendMsgToObservers("t1");
    }

}
