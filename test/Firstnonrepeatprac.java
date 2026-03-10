package test;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Firstnonrepeatprac {

	public static void main(String[] args) {
		
		String s="SWISS";
		Character c = s.chars()
		.mapToObj(e->(char)e)
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e->e.getValue()==1)
		.map(e->e.getKey())
		.findFirst()
		.get();
		System.out.println("first non repeat char "+c);

	}

}
