import java.util.LinkedHashMap;
import java.util.Map;
public class Mapdemo {
    public static void main(String[] args) {
        Map<Integer, Integer> hp = new LinkedHashMap<>();
        hp.put(10, 100);
        hp.put(19, 98);
        hp.put(10, 98);
        hp.put(12, 80);
        hp.put(13, 86);
        hp.put(15, 96);
        for (Map.Entry<Integer, Integer> i : hp.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
        hp.remove(12);
        // System.out.println(hp);
        if(hp.containsKey(10)){
            System.out.println("Marks of roll no " + hp.get(10));
        }else{
            System.out.println("Student not found");
        }
        hp.put(12, 49);
        for(Map.Entry<Integer,Integer> j : hp.entrySet()){
            System.out.println(j.getKey() + " " + j.getValue());
        }
    }
}