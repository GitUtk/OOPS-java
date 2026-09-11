import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        try{
            ageCheck(age);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    } 

    static void ageCheck(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("You can't vote");
        }else{
            System.out.println("Eligible to vote");
        }
    } 
    
}

class InvalidAgeException extends Exception { //check exception
    InvalidAgeException(String msg){
        super(msg);
    }
}