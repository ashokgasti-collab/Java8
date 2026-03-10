package prctice;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NewPractive {

	static int num(int num) {
		
		while(num>10) {
			num=sumDigits(num);
		}
		return num;
		
	}
	
	static int sumDigits(int sum) {
		return String.valueOf(sum)
		.chars()
		.map(Character::getNumericValue)
		.sum();
		}
	static String method(String s) {
	StringBuilder sb = new StringBuilder();
	int c=1;
	for(int i=0;i<s.length();i++) {
		if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
			c++;
		else {
			sb.append(s.charAt(i));
			sb.append(c);
			c=1;
		}
	}
		
	
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaawwwbaac";
		System.out.println(method(s));
		int i=12345;
		int sum = num(i);
		
		//.reduce(0,(a,b)->a+b);
		System.out.println("sum is:"+sum);
		
		
		
		int arr[]= {1, 2, 5, 6, 3, 2};
		Integer sln = Arrays.stream(arr).boxed().sorted((a,b)->b-a).skip(1).findFirst().get();
		System.out.println("Find the Second Largest Element in an Array:"+sln);
		int asInt = Arrays.stream(arr).max().getAsInt();
		System.out.println("max "+asInt);
		List<Integer> l= Arrays.asList(1, 2, 5, 6, 3, 2);
		
		 Integer max = l.stream().max((a,b)->b-a).get();
		System.out.println("maxi "+max);
		List<Integer> sc = l.stream().sorted((a,b)->b-a).collect(Collectors.toList());
		System.out.println("sorted collection "+sc);
		String st[] = {"apple", "banana", "orange", "kiwi", "strawberry"};
		String ls = Arrays.stream(st).max(Comparator.comparing(String::length)).get();
		System.out.println("Find the Longest String in an Array of Strings:"+ls);
		List<String> c = Arrays.stream(st).sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
		System.out.println("ascending order with lenth "+c);
		List<String> sotdlist = Arrays.stream(st).sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		System.out.println("sotdlist "+sotdlist);
		
		List<Integer> l1= Arrays.asList( 5, 6, -3, -2,0,0,0,1, 2,9);
		
		List<Integer> sl = l1.stream().sorted((a,b)->b-a).collect(Collectors.toList());
		System.out.println("sorted + and - & 0 "+sl);
		String s1= "coodinng";
		
		 List<Entry<String, Long>> moc = Arrays.stream(s1.split(""))		
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		
		.sorted(Map.Entry.<String,Long>comparingByValue().reversed())
		.collect(Collectors.toList());
		
		System.out.println("Count Occurrences of Each Character (Max Occurred Character First)"+moc);
		 List<Entry<String, Long>> cao = Arrays.stream(s1.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.collect(Collectors.toList());
		
		System.out.println("Count Frequency of Each Character in Alphabetical Order:"+cao);
		
	}

}
