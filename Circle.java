public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void draw() {
        int diameter = 2 * radius + 1;
        for (int i = 0; i < diameter; i++) {
            for (int j = 0; j < diameter; j++) {
                int x = i - radius;
                int y = j - radius;
                if (x * x + y * y <= radius * radius + radius * 0.8) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}