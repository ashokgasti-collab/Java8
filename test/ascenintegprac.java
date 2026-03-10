package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ascenintegprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(2,4,0,1,56,23,4);
		;System.out.println(list.stream().sorted().collect(Collectors.toList()));
		List<String> list2 = Arrays.asList("apple","zoo","pen","gun","bun");
		List<String> list3 = Arrays.asList( "Capgemini","Accenture","TCS","EPAM");
		System.out.println(list3.stream().sorted().collect(Collectors.toList()));
		
		////------DESECNDING-------			sorted((a,b)->b-a)			sorted((a,b)->b.compareTo(a))
		
	}

}
