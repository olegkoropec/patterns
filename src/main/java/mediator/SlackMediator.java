package mediator;

import java.util.ArrayList;

public class SlackMediator implements Mediator {
    private ArrayList<User> users = new ArrayList();

    public void addUserToChat(User user) {
        users.add(user);
    }

    @Override
    public void send(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
