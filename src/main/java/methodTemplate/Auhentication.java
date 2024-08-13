package methodTemplate;

public class Auhentication extends MethodTemplate {
    @Override
    protected void action1() {
        System.out.println("do verification");
    }

    @Override
    protected void action2() {
        System.out.println("create token");
    }

    @Override
    protected void action3() {
        System.out.println("send token");
    }
}
