package prctice;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practice3 {

	private static char[] charArray;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given a list of names, use Java 8 Streams to sort them in 
		//reverse alphabetical order and collect them into a new list.
		List<String>l=Arrays.asList("Ashshdfhg","Bobef","Ant","Donkeyh");
		//List<String> l1=l.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		List<String> l1 = l.stream()
				.sorted(Comparator.comparing(String::length))
				//.sorted(Collections.reverseOrder())
				//.sorted(Comparator.comparing(String::toString))
				.collect(Collectors.toList());
		System.out.println(l1);
		System.out.println(l.stream().collect(Collectors.joining(",","<",">")));
		String s = "This is a sample sentence.";
		
		String[] split = s.split(" ");
		for(String s1:split) {
			System.out.println(s1);
		}
		long count = Arrays.stream(s.split(" ")).count();
       System.out.println("Word count: " + count); // Output: 5
       
      int length = s.toCharArray().length;
      System.out.println("lenth "+length);
      List<Integer>l2=Arrays.asList(3,1,6,4,7,5);
       List<Integer> s1 = l2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       System.out.println("sorted "+s1);
    
	}

}

