public class Main {

    public static void main(String[] args) {

        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5);

        System.out.println("First renderer:");
        circle.draw();

        System.out.println();

        System.out.println("After switching renderer:");
        circle.setRenderer(rasterRenderer);
        circle.draw();

        System.out.println();

        Shape square = new Square(vectorRenderer, 10);
        square.draw();

        square.setRenderer(rasterRenderer);
        square.draw();
    }
}