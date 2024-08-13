package mediator;

public class MediatorMain {
    public static void main(String[] args) {
        SlackMediator slackMediator = new SlackMediator();

        User student = new Student(slackMediator);
        User student2 = new Student(slackMediator);
        User student3 = new Student(slackMediator);

        User mentor = new Mentor(slackMediator);

        slackMediator.addUserToChat(student);
        slackMediator.addUserToChat(student2);
        slackMediator.addUserToChat(student3);
        slackMediator.addUserToChat(mentor);

        mentor.send("Link ");
        student2.send("question 1");
        student3.send("question 2");
    }
}
