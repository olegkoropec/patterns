package visitor;

public class TelegramSender implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void send() {
        System.out.println("via Telegram...");
    }
}
