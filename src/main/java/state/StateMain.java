package state;

public class StateMain {
    public static void main(String[] args) {
        Phone phone = new Phone();

        OfflineMode offlineMode = new OfflineMode();
        OnlineMode onlineMode = new OnlineMode();

        offlineMode.action(phone);
        System.out.println(phone.getState());

        onlineMode.action(phone);
        System.out.println(phone.getState());
    }
}
