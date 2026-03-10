package prctice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		List<String> arr1 = Arrays.asList("potato:veg" , "mango:fruits","banana:fruits");

//		Map<String, List<String>> result = arr1.stream()
//			.map(e->e.split(":"))
//			.collect(Collectors.groupingBy(ar->ar[1],Collectors.mapping(ar->ar[0], Collectors.toList())));
//		     
//	        System.out.println(result);
		  
	        Map<Boolean,List<String>> map = arr1.stream().collect(Collectors.partitioningBy(e->e.contains("veg")));
	        List<String> list = map.get(true);
	        List<String> list2 = map.get(false);
	        System.out.println("map of entry:"+list+"  "+list2);
	        
	        
		  List<String> out = listOfStrings.stream().sorted(Comparator.comparingInt(e->e.length())).collect(Collectors.toList());
		  //.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		System.out.println("ascending order"+out);

	}

}
