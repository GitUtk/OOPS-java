import java.util.Scanner;
public class PredefinedExceptions{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int i = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            System.out.println(i/b);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("An Error occured : " + e.getMessage());
        }
    }
}