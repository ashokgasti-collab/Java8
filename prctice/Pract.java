package prctice;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> n1 = Arrays.asList(Arrays.asList("HR","Finance"),
				Arrays.asList("IT","sales"),Arrays.asList("HR","Service"));
		
	
	//	List<String> fm = nl.stream().flatMap(Collection::stream).collect(Collectors.toList());
		List<String> fm=	n1.stream().flatMap(e->e.stream()).collect(Collectors.toList());
				
		
		System.out.println("\n FLAT Map"+fm);
		 List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
         listOfIntegers.stream();
	        int max = listOfIntegers.stream().max((a,b)->a-b).get();
	        Integer mx = listOfIntegers.stream().max(Integer::compare).get();
	        System.out.println("Maximum ele"+   listOfIntegers.stream().mapToInt(e->e).max().getAsInt());
	        System.out.println("Maximum Element : "+max+"max"+mx);
	        
	        
//merge two unsorted arrays into single sorted array 
	        int[] a = new int[] {4, 2, 7, 1};
	         
	        int[] b = new int[] {8, 3, 9, 5};
	        
	        int sum = Arrays.stream(a).sum();
	        int max1 = Arrays.stream(a).max().getAsInt();
	        OptionalDouble average = Arrays.stream(b).average();
	        System.out.println("sum and Average and max = "+sum+average+max1);
	        
	        Object[] ssa = Stream.concat(Arrays.stream(a).boxed(),
	        		Arrays.stream(b).boxed()).sorted()
	        		.toArray();
	        System.out.println("merge two unsorted arrays into single sorted array :"+Arrays.toString(ssa));
	        
	        //partioning and collect
	        
	       Map<Boolean, List<Integer>> mp = Arrays.stream(a).boxed()
	    		   .collect(Collectors.partitioningBy(e->e%2==0));
	       
	       List<Integer> lodd = mp.get(false);
	       List<Integer> leven = mp.get(true);
	       System.out.println("odd and even partition :"+lodd+leven+mp);
	       
	        int i = 15623;	
	        long sod = String.valueOf(i).chars().map(Character::getNumericValue).sum();
//	        int sod = String.valueOf(i)
//	        .chars()
//	        .map(Character::getNumericValue)
//	        .sum();
	        
	        System.out.println("sum of all digits of a number: "+sod);
	        System.out.println("sort string with lenght: "); 
	        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
	        listOfStrings.stream()
	        .sorted(Comparator.comparing(String::length))
	        .forEach(System.out::println);
	        System.out.println("string with lenght: ");
	        listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),
	        		Collectors.mapping(String::length, Collectors.toList())))
	        		.forEach((k,v)->System.out.println(k+v));
	       
	        System.out.println(" group the string with lenght: ");
 Map<Integer, List<String>> map = listOfStrings.stream()
	        						.collect(Collectors.groupingBy(String::length));
	        System.out.println(map);
	        System.out.println("strings start with prefix \"C\"");
	        listOfStrings.stream().
	        filter(e->e.startsWith("C"))
	        .forEach(System.out::println);
	        
 //find common elements between two arrays?
	        
	        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
	         
	        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
	        
	        list1.stream().filter(list2::contains).forEach(e->System.out.println("common elements between two arrays"+e));
	        
// find out those strings which start with a number?
	        
	        List<String> los = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
	    
	      los.stream().filter(e->Character.isDigit(e.charAt(0)))
	      .forEach(e->System.out.println("strings which start with a number?"+e));
	        
//i/o:welcome to java  o/p: Welcome To Java	
	        
	        String st= "welcome to java";
	        String[] ar = st.split(" ");
	       
	       for(String s:ar) {
	    	   StringBuffer sb= new StringBuffer(s);
	    	   sb.reverse();
	    	   sb.append(" ");
	    	   System.out.print(sb);
	       }
	     
	  
	       
	       Arrays.stream(st.split(" "))
	       
	       .map(e->String.valueOf(e.charAt(0)).toUpperCase()+e.substring(1)+" ")
	       .forEach(System.out::print);
//remove duplicate chars from sting
//find all strings stat with prefix "A";
//reverse order of words in sentence
	       System.out.println();
	       String s="welcome";
	       s.chars().mapToObj(e->(char)e).distinct().forEach(System.out::print);
	       
	       
	       String rs = Arrays.stream(st.split(" "))  
	         .map(e->new StringBuffer(e).reverse()).collect(Collectors.joining(" "));
	       System.out.println("\n reverse order of words in sentence "+rs);
	}

}
