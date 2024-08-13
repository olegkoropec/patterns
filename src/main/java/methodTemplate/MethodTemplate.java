package methodTemplate;

public abstract class MethodTemplate {

    public void doAction() {
        action1();
        action2();
        action3();
    }

    protected abstract void action1();
    protected abstract void action2();
    protected abstract void action3();

}
