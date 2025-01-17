public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("square")) {
            return new Square(5);
        } else if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle(3);
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle(5);
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle(4, 6);
        } else {
            return null;
        }
    }
}