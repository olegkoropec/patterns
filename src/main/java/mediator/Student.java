package mediator;

public class Student extends User {
    public Student(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String text) {
        System.out.println("Student received: " + text);
    }
}
