package code;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pract1 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(); // ✅ Use generics
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list2.add(15);
        list2.add(5);
        //list.remove();
        
        System.out.println(list1+"and"+list2);
        List<Integer> sort = Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
        System.out.println("sorted"+sort);
    }
}

