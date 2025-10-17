public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new CircleFactory();
        Shape shape = factory.createShape();
        shape.draw();

        factory = new RectangleFactory();
        shape = factory.createShape();
        shape.draw();
    }
}
