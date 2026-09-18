import java.util.*;

class MarksOperations {

    public static void addMarks(List<Integer> marks, int mark) {
        marks.add(mark);
    }

    public static double calculateAvg(List<Integer> marks) {
        double sum = 0.0;
        for (int i : marks) {
            sum += i;
        }
        return sum / marks.size();
    }

    public static int findHighest(List<Integer> marks) {
        int highest = marks.get(0);
        for (int i : marks) {
            if (i > highest) {
                highest = i;
            }
        }
        return highest;
    }

    public static void displayMarks(List<Integer> marks) {
        Iterator<Integer> it = marks.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

public class ArrayListMarks {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        MarksOperations.addMarks(marks, 29);
        MarksOperations.addMarks(marks, 85);
        MarksOperations.addMarks(marks, 92);
        MarksOperations.addMarks(marks, 67);
        MarksOperations.displayMarks(marks);
        System.out.println("Average: " + MarksOperations.calculateAvg(marks));
        System.out.println("Highest: " + MarksOperations.findHighest(marks));
    }
}