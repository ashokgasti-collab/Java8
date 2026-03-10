package testjava8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class printduplicatelemt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(1,2,3,3,2,0);
		Set<Integer>s=new HashSet<Integer>();
		System.out.println(l.stream().filter(e->!s.add(e)).collect(Collectors.toList()));

	}

}
