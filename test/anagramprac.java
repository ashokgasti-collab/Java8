package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class anagramprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []arr= {"tea","eat"};
		 char[] c1 = arr[0].toCharArray();
		char[] c2 = arr[1].toCharArray();
		
		Arrays.sort(c1);Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))System.out.println("Anagrams");
		else System.out.println("Not Anagrams");
		

		List<String> words = Arrays.asList("cat", "act", "dog", "god", "eat", "ate");
		
		


        Map<String, List<String>> grouped = words.stream()
            .collect(Collectors.groupingBy(word -> {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                return new String(chars);
            }));

        // Print result
        grouped.values().forEach(System.out::println);
        grouped.keySet().forEach(System.out::println);
        System.out.println("map:"+grouped );
    }

		
	}


