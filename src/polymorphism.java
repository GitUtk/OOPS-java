class MathUtil {
    int multiply(int a, int b) { 
        return a * b; 
    }
    double multiply(double a, double b) {
         return a * b; 
    }
}
public class polymorphism {
    public static void main(String[] args) {
        System.out.println("Ploymorphism");
        MathUtil math = new MathUtil();
        System.out.println(math.multiply(5, 4));
        System.out.println(math.multiply(9.8, 6.3));
    }
}
