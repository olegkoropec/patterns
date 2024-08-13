package chanOfResp;

public interface Handler {
    void handle(String request);

    void setNextHHandler(Handler hHandler);
}
