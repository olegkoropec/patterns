package visitor;

public class SenderVisitor implements Visitor {
    @Override
    public void visit(TelegramSender telegramSender) {
        System.out.println("telegram");
        telegramSender.send();
    }

    @Override
    public void visit(EmailSender emailSender) {
        System.out.println("email");
        emailSender.send();
    }
}
