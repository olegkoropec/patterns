package facade;

public class FacadeMain {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        FileSystem fileSystem = new FileSystem();
        Wifi wifi = new Wifi();

        Phone phone = new Phone(dataBase, fileSystem, wifi);
        phone.turnOn();
    }
}
