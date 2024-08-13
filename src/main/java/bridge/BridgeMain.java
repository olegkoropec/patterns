package bridge;

public class BridgeMain {
    public static void main(String[] args) {
        DrawingAPI drawApiImpl1 = new DrawApiImpl1();
        DrawingAPI drawApiImpl2 = new DrawApiImpl2();

        Circle circle = new Circle(drawApiImpl1, 2.0, 3.0, 22.0);
        Circle circle2 = new Circle(drawApiImpl2, 12.0, 31.0, 212.0);
    }
}
