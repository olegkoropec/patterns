package facade;

public class Phone {
    private DataBase dataBase;
    private FileSystem fileSystem;
    private Wifi wifi;

    public Phone(DataBase dataBase, FileSystem fileSystem, Wifi wifi) {
        this.dataBase = dataBase;
        this.fileSystem = fileSystem;
        this.wifi = wifi;
    }

    public void turnOn() {
        dataBase.connect();
        fileSystem.readFile();
        wifi.connection();
    }
}
