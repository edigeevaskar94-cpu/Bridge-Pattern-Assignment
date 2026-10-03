public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing Circle using Vector Renderer. Radius: " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing Square using Vector Renderer. Side: " + side);
    }
}