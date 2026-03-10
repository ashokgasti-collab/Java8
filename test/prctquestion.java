package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class prctquestion {

	public static void main(String[] args) {
		 List<Integer> list= Arrays.asList(3,5,6,3,6,23,87,27,46,54,98,43);
		 List<String> list2 = Arrays.asList("apple","zoo","pen","gun","bun");
		  double doubleValue = list.stream().filter(e->e%2==0).mapToInt(n->n).average().orElse(0);
		
		 System.out.println("Avg even no "+doubleValue);
	       
	      
	       
	       //----------------------------//
	   	List<String> arr1 = Arrays.asList("potato:veg" , "mango:fruits","banana:fruits");
	   	Map<String, List<String>> map = arr1.stream()
	   	.map(e->e.split(":")) 
	  	.collect(Collectors.groupingBy(ara->ara[1],Collectors.mapping(ara->ara[0], Collectors.toList())));
	   	System.out.println("map of entries "+map);
	   	
	    List<String> listOfStrings = Arrays.asList("Long Book", "Note Book", "White","Black Book", "Mac Book", "Pen", "Book", "Pencil");
	  Map<Boolean, List<String>> m1 = listOfStrings.stream().collect(Collectors.groupingBy(e->e.contains("Book")));
	    
	    System.out.println(m1);
	       
	       String s= "CAPGEMINI";
	       StringBuilder sb = new StringBuilder();
	        
	        for(int i=0;i<s.length();i++){
	           
	             sb.append((i+1)%2==0 ? '$':s.charAt(i));
	            
	        }
	        System.out.println("modified string "+sb);
	        //---------------------------------------------------//
	        StringBuilder s1= new StringBuilder(s);
	        for(int i=0;i<s.length();i++) {
	        	
	        	if(i%2==0)
	        		s1.setCharAt(i, '$');
	        }
	        System.out.println("modified string "+s1);
		// TODO Auto-generated method stub

	}

}
