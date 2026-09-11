public class shapes {
    public void area() {
        System.out.println("Empty Shape");
    }
}

class Circle extends shapes {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends shapes {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

public class ShapesTest {
    public static void main(String[] args) {
        shapes s1 = new Circle(5);
        shapes s2 = new Rectangle(4, 6);

        s1.area();
        s2.area();
    }
}
