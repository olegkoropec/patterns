package ZZPatternsExample;
// Декоратор застосовується для динамічної зміни об’єктів, їхньої модернізації. Він передбачає розширення функціональності об'єкта без визначення підкласів.
// Декоратор можна розпізнати за конструкторами, які приймають у параметрах об’єкти того самого абстрактного типу або інтерфейсу, що й поточний клас.
// В Java цей патерн широко використовується в класах введення/виведення: java.io.InputStream; OutputStream; Reader та Writer
public class DecoratorLesson {
    public static void main(String[] args) {
//        Developer developer = new JavaDeveloper();
//        Developer developer = new SeniorJavaDeveloper(new JavaDeveloper());
        Developer developer = new TeamLeadJavaDeveloper(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}

interface Developer {
    public String makeJob();
}

class JavaDeveloper implements Developer {      // цей клас використовується як бозова реалізація
    @Override
    public String makeJob() {
        return "I make code. ";
    }
}

//========================================================================================================
class DeveloperDecorator implements Developer {    // це клас-декоратор, який використовується для того, щоб показати як працює шаблон(патерн) Dekorator
    Developer decorator;

    public DeveloperDecorator(Developer decorator) {
        this.decorator = decorator;
    }

    @Override
    public String makeJob() {
        return decorator.makeJob();
    }
}

class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer decorator) {
        super(decorator);
    }

    String makeCodeReview() {
        return "Make code review. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}

class TeamLeadJavaDeveloper extends DeveloperDecorator {
    public TeamLeadJavaDeveloper(Developer decorator) {
        super(decorator);
    }
    String makeReport(){
        return "Send week report";
    }
    public String makeJob(){
        return super.makeJob() + makeReport();
    }
}

