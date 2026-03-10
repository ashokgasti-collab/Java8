package testjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class startingwith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(1,200,11,100);
		System.out.println(l.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("1")).collect(Collectors.toList()));;
	}

}
