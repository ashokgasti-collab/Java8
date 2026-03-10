package employe;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> a=Arrays.asList(1,2,3,4);
		 System.out.println( a.stream().mapToInt(e->e).max().getAsInt());
		 List<Integer> b=Arrays.asList(9,4,5,6,7,1,5);
		 Map<Integer,Integer>map= new HashMap<>();
		 
		 Stream.concat(a.stream(), b.stream())
		 		.collect(Collectors.toList())
		 		.forEach(c->map.put(c, map.getOrDefault(c, 0)+1));
		 System.out.println(map);
		 
		  
		// System.out.println(i);
		 
		 //find max and avg val fom map key set
		 System.out.println( map.keySet().stream().max(Integer::compare).get());
		 System.out.println( map.keySet().stream().mapToInt(e->e).average());
		 map.keySet().stream().sorted(Comparator.reverseOrder()).forEach( System.out::println);;
		 
		 //find second highest element
		 System.out.println(b.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
		 //sum of squres 
		 System.out.println(a.stream().mapToInt(e->e*e).reduce(0, (c,d)->c+d));
		 System.out.println(a.stream().map(e->e*e).reduce(Integer::sum).get());
		 //find all elements are even
		 System.out.println( a.stream().allMatch(e->e%2==0));
		 //grouping Integers by Their Parity
		 System.out.println( b.stream().collect(Collectors.groupingBy(e->(e%2==0)?"Even":"ODD"))) ;
		 b.stream().collect(Collectors.groupingBy(e->e%2==0?"Even":"Odd"));
		 String s="Ashoko";
		 System.out.println(s.chars().mapToObj(c->(char) c)
		 			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 			.entrySet()
		 			.stream()
		 			.filter(x->x.getValue()>1)
		 			.collect(Collectors.toList()));

		}

}
