package chanOfResp;

public abstract class BaseHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handle(String request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }

    @Override
    public void setNextHHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
