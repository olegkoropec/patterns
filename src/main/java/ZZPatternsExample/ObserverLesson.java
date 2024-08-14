package ZZPatternsExample;

import java.util.ArrayList;
import java.util.List;
public class ObserverLesson {
    public static void main(String[] args) {
        JavaDeveloperJobeSite jobeSite = new JavaDeveloperJobeSite();
        jobeSite.addVacansies("Junior");
        jobeSite.addVacansies("Middle");

        ObserverJavaJob name1 = new Subscriber("Oleh");
        ObserverJavaJob name2 = new Subscriber("Artem");

        jobeSite.addObserver(name1);
        jobeSite.addObserver(name2);

        jobeSite.addVacansies("Senior");

        jobeSite.removeVacansies("Junior");
    }
}

interface ObserverJavaJob {
    public void handleEvent(List<String> vacanc);
}
interface ObserverableJavaJob {
    public void addObserver(ObserverJavaJob observer);

    public void removeObserver(ObserverJavaJob observer);

    public void notifyObserver();
}
class Subscriber implements ObserverJavaJob {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacanc) {
        System.out.println("Dear " + name + "\nWe have some vacation for you:\n" + vacanc +
                "\n========================================================\n");
    }
}

class JavaDeveloperJobeSite implements ObserverableJavaJob {
    List<String> vacancies = new ArrayList<>();
    List<ObserverJavaJob> subscribers = new ArrayList<>();

    public void addVacansies(String vacansie) {
        this.vacancies.add(vacansie);
        notifyObserver();
    }

    public void removeVacansies(String vacansie) {
        this.vacancies.remove(vacansie);
        notifyObserver();
    }

    @Override
    public void addObserver(ObserverJavaJob observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(ObserverJavaJob observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (ObserverJavaJob observer : subscribers)
            observer.handleEvent(this.vacancies);
    }
}


