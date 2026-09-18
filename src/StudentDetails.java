import java.util.*;
class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

class Student {
    String name;
    int rollNo;
    int tmarks;

    Student(String name, int rollNo, int tmarks) throws InvalidMarksException {
        if (tmarks < 0) {
            throw new InvalidMarksException("Invalid marks: Marks cannot be less than 0");
        }
        this.name = name;
        this.rollNo = rollNo;
        this.tmarks = tmarks;
    }
    void display() {
        System.out.println("Student name is: " + name);
        System.out.println("Student roll no is: " + rollNo);
        System.out.println("Student mark is: " + tmarks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        List<Student> li = new LinkedList<>();
        try {
            li.add(new Student("Utkarsh", 34, 45));
            li.add(new Student("Aryan", 6, -1));
            for (Student s : li) {
                s.display();
                System.out.println();
            }
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}
