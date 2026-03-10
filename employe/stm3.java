package employe;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java articles are Awesome";
		String s2 = "Java   code ";

		 String sb8 = Arrays.stream(s1.trim().split(" ")).map(e->new StringBuilder(e).reverse())
		.collect(Collectors.joining(" "));
		System.out.println(sb8);
		String[] array2 = { "java", "programming" };
		String[] st = { "apple", "ball", "java", "microservices" };
		String j = String.join("", st);
		System.out.println("string join: "+j);
		//concate two array of strings to list
		List<String> l = Stream.concat(Arrays.stream(st), Arrays.stream(array2)).collect(Collectors.toList());
		//fing longest string in array of strings
		String i = Arrays.stream(st).max((a,b)->a.compareTo(b)).map(e->e+"-"+e.length()).get();
		System.out.println("longest string in array of strings: "+i);
		// find fist element start with j
		System.out.println(l.stream().filter(e -> e.startsWith("j")).findFirst().get());
		// find count of paticula element
		System.out.println(l.stream().filter(e -> e.equalsIgnoreCase("java")).count());
		// sort elements based on their length
		 List<String> collect = l.stream().sorted(Comparator.comparingInt(String::length).reversed())
		.map(m->m+"-"+m.length()).collect(Collectors.toList());
		;
																																																																			
				System.out.println("sort elements based on their length "+collect);
		// find duplicate string
				System.out.println("list"+l);
		Map<String, Long> m = l.stream().filter(x -> Collections.frequency(l, x) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		l.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 .entrySet()
		 .stream()
		 .filter(e->e.getValue()>1)
		 .map(e->e.getKey()+"-"+e.getValue())
		  .forEach(System.out::println);
		System.out.println("duplicate"+m);
		
		 String maxstng = l.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.max(Map.Entry.comparingByValue())
		.map(e->e.getKey()).get();
		 System.out.println("max or more duplicate "+maxstng);
	//	System.out.println(entry.getKey()+"-"+entry.getValue());
		 
		 List<String> l1 = Arrays.asList("abc","aaa","xyz","pqr","aaa");
		 List<Entry<String, Long>> mapl = l1.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.sorted(Map.Entry.<String, Long>comparingByValue().reversed())
		.collect(Collectors.toList());
		
		 List<Entry<String, Long>> m1 = l1.stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			.entrySet()
			.stream()
			.sorted(Map.Entry.<String, Long>comparingByKey().reversed())
			.collect(Collectors.toList());
		
			System.out.println(mapl);
			System.out.println(m1);
		
		//sort the stings 
		      l.stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			.entrySet()	
			.stream()
			.sorted(Map.Entry.comparingByKey())
			.skip(1)
			.map(e->e.getKey())
			//.forEach(e->System.out.println("c2---"+e.getKey()+e.getValue()));;
		    .forEach(System.out::println);
					
		System.out.println("c2---");
		
		 List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
         
	        String joinedString = listOfStrings.stream().collect(Collectors.joining("- ", "[", "]"));
	         
	        System.out.println(joinedString);
		
		
		String s = s2.replaceAll(" ", "");
		System.out.println(s);
		String stg = s1.replaceAll("  +", " ");
		System.out.println(stg);
		// count no of charactes in string use map
		Map<Character, Integer> map = new HashMap<>();
		s.chars().mapToObj(c -> (char) c).map(Character::toLowerCase)
				.forEach(c -> map.put(c, map.getOrDefault(c, 0) + 1));
		System.out.println(map);
		System.out.println(map.keySet().stream().max(Integer::compare).get());
		map.keySet().stream().sorted().forEach(System.out::print);
		System.out.println();
		// count no of charactes in string by split use map
		Map<String, Long> c = Arrays.stream(s1.split(" ")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(c);
		//Anagarama
		String sa ="top"; String sb ="pot";  String sc ="madam";
		sa = Arrays.stream(sa.split("")).sorted().collect(Collectors.joining());
		sb = Arrays.stream(sb.split("")).sorted().collect(Collectors.joining());
		if(sa.equals(sb))
			System.out.println("Anagrama");
		
	
StringBuffer pal = new StringBuffer(sc).reverse();
		if(sc.equals(pal.toString()))
			System.out.println("Palindrom");
		
	}

}

