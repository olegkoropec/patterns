package ZZPatternsExample;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ObserverLessonMeteostation {
    public static void main(String[] args) throws IOException {
        MeteoStation station = new MeteoStation();
        station.addObserver(new ConsoleObserver());

//        station.addObserver(new FileObserver());
        station.setMeteo(-10, 740);
        station.setMeteo(0, 750);
    }
}

interface ObservedMeteo {
    void addObserver(ObserverMeteo obs);

    void removeObserver(ObserverMeteo obs);

    void notifyObserver() throws IOException;

}

interface ObserverMeteo {
    void handleEvent(int temperature, int pressure) throws IOException;
}

class MeteoStation implements ObservedMeteo {

    int temperature;
    int pressure;
    List<ObserverMeteo> observers = new ArrayList<>();

    void setMeteo(int temp, int press) throws IOException {
        temperature = temp;
        pressure = press;
        notifyObserver();
    }
    @Override
    public void addObserver(ObserverMeteo obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(ObserverMeteo obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObserver() throws IOException {
        for (ObserverMeteo obs : observers) {
            obs.handleEvent(temperature, pressure);
        }
    }
}

class ConsoleObserver implements ObserverMeteo {

    @Override
    public void handleEvent(int temperature, int pressure) {
        System.out.println("Зараз температура = " + temperature + ", тиск = " + pressure);
    }
}
class FileObserver implements ObserverMeteo {

    @Override
    public void handleEvent(int temperature, int pressure) {
        File file;
        try {
            file = File.createTempFile("TemperaturePressure", ".txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print("Зараз температура = " + temperature + ", тиск = " + pressure);
            printWriter.println();
            printWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}