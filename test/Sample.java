package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("hello world", "java code");
		System.out.println(list.stream().flatMap(e->Arrays.stream(e.split(" ")))
				
				.collect(Collectors.toList()));
		
	}

}
