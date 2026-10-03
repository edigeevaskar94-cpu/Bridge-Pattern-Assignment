public class RasterRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawing Circle using Raster Renderer. Radius: " + radius);
    }

    @Override
    public void renderSquare(double side) {
        System.out.println("Drawing Square using Raster Renderer. Side: " + side);
    }
}