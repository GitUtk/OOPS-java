import java.util.*;

public class RemoveDuplicates {

    public static Set<String> removeDuplicates(List<String> names) {
        Set<String> st = new LinkedHashSet<>();
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            st.add(it.next());
        }
        Iterator<String> it2 = st.iterator();
        while(it2.hasNext()){
            
        }
        return null;
    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Aman");
        names.add("Riya");
        names.add("Karan");
        names.add("Aman");
        names.add("Riya");
        names.add("Simran");
        names.add("Karan");

        Set<String> uniqueNames = removeDuplicates(names);

        System.out.println("Original List: " + names);
        System.out.println("Unique Names: " + uniqueNames);
    }
}