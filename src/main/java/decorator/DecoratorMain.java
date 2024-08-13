package decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println(espresso.name() + ": " + espresso.price());

        Coffee milkDecorator = new MilkDecorator(espresso);
        System.out.println(milkDecorator.name() + ": " + milkDecorator.price());

        SugarDecorator sugarDecorator = new SugarDecorator(milkDecorator);
        System.out.println(sugarDecorator.name() + ": " + sugarDecorator.price());
    }
}
