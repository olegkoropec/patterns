package visitor;

public class VisitorMain {
    public static void main(String[] args) {
        TelegramSender telegramSender = new TelegramSender();
        EmailSender emailSender = new EmailSender();

        SenderVisitor senderVisitor = new SenderVisitor();

        telegramSender.accept(senderVisitor);
        emailSender.accept(senderVisitor);
    }
}
