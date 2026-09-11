abstract class Shape{
    abstract Double area();
    void displayArea(){
        System.out.println("Area ="+area());
    }
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override 
    Double area(){
        return 3.14*radius*radius;
    }
}

class Rectangle extends Shape{
    double length,width;
    Rectangle(Double length,Double width){
        this.length=length;
        this.width=width;
    }

    @Override 
    Double area(){
        return length*width;
    }
}



public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
 
        for (Shape s : shapes) {
            s.displayArea();   // must print correct area for each shape
        }
    }
}