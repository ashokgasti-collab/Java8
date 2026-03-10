package test;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Highfreqcharecpract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="teststring";
		 Character c = str.chars()
		.mapToObj(e->(char)e)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.max(Map.Entry.comparingByValue())
		.map(e->e.getKey())
		.orElseGet(null);
		 System.out.println("highfrquency "+c);
		
	}

}
