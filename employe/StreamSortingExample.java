package employe;



import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSortingExample {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(5, 3, 9, 1, 7);

        List<Integer> sortedDescending =
        		      values.stream()           
        		    				.sorted(Collections.reverseOrder()) // Reverses the sorting order
        		    				.collect(Collectors.toList());
        List<Integer> c = values.stream()
        						.sorted(Comparator.reverseOrder())
        						.collect(Collectors.toList());
        System.out.println("Sorted (Descending): "+c);
        System.out.println("Sorted (Descending): " + sortedDescending);
        System.out.println("Sorted " + values.stream().sorted((a,b)->a-b).collect(Collectors.toList()));
        
 // find maximum and minimum of those numbers
        
    Integer max = values.stream().max((a,b)->a-b).get(); 
    System.out.println("Maximum value: " + max);
    
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");
 
       List<String> concatStream  = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
         
        // Concatenated the list1 and list2 by converting them into Stream
        System.out.println(concatStream);
        int arr[] = { 99, 55, 203, 99, 4, 91 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        for(int a:arr)
        	System.out.println(a);
 
    }
}


