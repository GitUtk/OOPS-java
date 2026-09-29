package collections;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(4);
        list.add(5);
        list.add(35);
        list.add(32);
        list.sort(null); //  default ascending order 
        list.sort(Collections.reverseOrder());
        // for(Integer i : list){
        //     System.out.print(i + " ");
        // }
        System.out.println(list);

    }
}
