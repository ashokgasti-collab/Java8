package employe;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {
		Set<Integer> s= new HashSet<>();
		List<Integer> a=Arrays.asList(1,2,3,3,2,5,5,6);
		//List<Integer> b=Arrays.asList(1,2,3,3,2,5,5,6);
		List<Integer> c= a.stream().distinct().collect(Collectors.toList());
		System.out.println(a);
		System.out.println( a.stream().mapToInt(e->e.intValue()).sum());
		a.stream().filter(e->!s.add(e)).forEach(System.out::println);
		System.out.println("Current Local Date: " + java.time.LocalDate.now());
        //Used LocalDate API to get the date
        System.out.println("Current Local Time: " + java.time.LocalTime.now());
        //Used LocalTime API to get the time
        System.out.println("Current Local Date and Time: " + java.time.LocalDateTime.now());
        //Used LocalDateTi
        
        
		
	}

}
