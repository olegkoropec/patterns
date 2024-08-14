package ZZPatternsExample;

public class DecoratorLessonAbstract {
    public static void main(String[] args) {
        Print print1 = new PrintArtem(new PrePrint());
        Print print2 = new PrintOleh(new PrintArtem(new PrePrint()));
        Print print3 = new PrintArtem(new PrintOleh(new PrePrint()));
        System.out.println(print1.read());
        System.out.println(print2.read());
        System.out.println(print3.read());
    }
}

interface Print {
    public String read();
}

class PrePrint implements Print {
    @Override
    public String read() {
        return "hi";
    }
}
abstract class AbstrDecorator implements Print{
    Print print;
    public AbstrDecorator(Print print) {
        this.print = print;
    }
    @Override
    public String read() {
        return  print.read();
    }
}
class PrintArtem extends AbstrDecorator {
    public PrintArtem(Print print) {
        super(print);
    }
    @Override
    public String read() {
        return "Artem " + super.read();
    }
}
class PrintOleh extends AbstrDecorator {
    public PrintOleh(Print print) {
        super(print);
    }
    @Override
    public String read() {
        return "Oleh " + super.read();
    }
}


