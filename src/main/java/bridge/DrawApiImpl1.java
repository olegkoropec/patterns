package bridge;

public class DrawApiImpl1 implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println(
                String.format("API 1: drawing %d with %d and radius %d", x, y, radius));
    }
}
