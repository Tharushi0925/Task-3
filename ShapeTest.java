public class ShapeTest {
    public static void main(String[] args) {
        Shape square = ShapeFactory.getShape("square");
        square.draw();

        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();

        Shape triangle = ShapeFactory.getShape("triangle");
        triangle.draw();

        Shape rectangle = ShapeFactory.getShape("rectangle");
        rectangle.draw();
    }
}