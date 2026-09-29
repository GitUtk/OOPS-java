import java.util.ArrayList;
import java.util.Comparator;

class Student {
    int rollno;
    String name;
    int marks;

    Student(int r, String n, int m) {
        this.rollno = r;
        this.name = n;
        this.marks = m;
    }
    @Override 
    public String toString(){
        return rollno+" "+name+" "+marks;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.marks != o2.marks) {
            return Integer.compare(o2.marks, o1.marks); // marks descending
        }
        return Integer.compare(o1.rollno, o2.rollno);   // roll no ascending
    }
}

class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1, o2);
    }
}

class NameComparator implements Comparator<Student>{
    @Override 
    public int compare(Student o1,Student o2){
        return o2.name.compareTo(o1.name);
    }
}
public class comparatorProgram {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        a.add(10);
        a.add(4);
        a.add(5);
        a.add(35);
        a.add(32);

        a.sort(null);

        // System.out.println(a);

        ArrayList<Student> st = new ArrayList<>();

        st.add(new Student(10, "Rahul", 100));
        st.add(new Student(9, "Rohit", 90));
        st.add(new Student(5, "Rakesh", 85));
        st.add(new Student(20, "Meetesh", 90));
        st.add(new Student(11, "Shristi", 85));

        st.sort(new StudentComparator());
        System.out.println(st);
        st.sort(new NameComparator());
        System.out.println(st);

        // Display all the detailed in descending order of there name

    }
}
