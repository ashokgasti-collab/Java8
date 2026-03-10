package employe;


import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import multithd.Singleton;



public class Groupegstrm {
	
	public static void main(String[] args) {
		Map<Emp,Integer>m1= new HashMap<>();
		List<Emp> l= Arrays.asList(new Emp("John", 50000,"IT",30),
									new Emp("Abraahim", 40000,"IT",30),
									new Emp("Sony", 60000,"CSE",33),
									new Emp("Abi", 70000,"CSE",33),
									new Emp("virat", 50000,"NONIT",29),
									new Emp("bob", 40000,"NONIT",29));
		System.out.println(l.stream().map(Emp::getName).filter(e->e.length()>5).collect(Collectors.toList()));
		
		System.out.println(Singleton.method());
		l.forEach(c->m1.put(c, m1.getOrDefault(c, 0)+1));
		
		System.out.println(m1);
		//get highest salary of employ from each dept
		 Map<String, Optional<Emp>> map = 
				 l.stream().collect(Collectors.groupingBy(Emp::getDept,
				 Collectors.maxBy(Comparator.comparing(Emp::getSalary))));
		 System.out.println(map);
		 System.out.println("---");
		 System.out.println("max sal each dept"+ l.stream()
		 .collect(Collectors.groupingBy(Emp::getDept, 
				 Collectors.mapping(Emp::getSalary, 
						 Collectors.maxBy(Comparator.naturalOrder())))));
		 
		 System.out.println( l.stream().
					 collect(Collectors.groupingBy(Emp::getName,Collectors.counting())));
			//get highest salay of employ from each dept	 
			  Map<String, Emp> collect = l.stream()
					    .collect(Collectors.groupingBy(Emp::getDept,
					        Collectors.collectingAndThen
					        (Collectors.maxBy(Comparator.comparing(Emp::getSalary)),e->e.get())));
				System.out.println();
				collect.forEach((c,v)->{System.out.println(c+":"+v);});
				
		//get highest salay of employ from each dept
				Map<String, Optional<Emp>> h = l.stream().collect(Collectors.groupingBy(Emp::getDept,
						Collectors.collectingAndThen(Collectors.toList(),
						i->i.stream().max(Comparator.comparing(Emp::getSalary)))));
				System.out.println("---");
				h.forEach((c,v)->{System.out.println(c+":"+v);});
				//get ascending salay of employ from each dept
				 Map<String, Stream<Emp>> h2 = l.stream().collect(Collectors.groupingBy(Emp::getDept,
						Collectors.collectingAndThen(Collectors.toList(),
						i->i.stream().sorted(Comparator.comparingInt(Emp::getSalary)))));
				System.out.println("---");
				
				h2.forEach((c,v)->{System.out.println(c+":"+v.collect(Collectors.toList()));});
					
					
				
				//goup by salary
				 Map<Integer, List<String>> collect3 = l.stream()
			    .collect(Collectors.groupingBy(Emp::getSalary,
			    		Collectors.mapping(Emp::getName, Collectors.toList())));
				System.out.println();
				System.out.println(collect3);
				
				 Map<Integer, List<String>> c4 = l.stream()
					  .collect(Collectors.groupingBy(Emp::getAge,
							  Collectors.mapping(Emp::getName,Collectors.toList())));
							  
			
				System.out.println();
				System.out.println(c4);
				List<Integer>m=Arrays.asList(1,0,1,0,1,0,1,0);
				List<Integer> list = m.stream().sorted(Comparator.reverseOrder())
						.collect(Collectors.toList());
				System.out.println();
				System.out.println(list);
				System.out.println(m.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));
				
		          Map<String, Integer> collect2 = l.stream()
		                    .collect(Collectors.groupingBy(Emp::getDept,
		                             Collectors.summingInt(Emp::getSalary)));
		      	System.out.println();
		          System.out.println(collect2);
		  		System.out.println(   l.stream()
                  .collect(Collectors.groupingBy(Emp::getDept,
                                                 Collectors.averagingInt(Emp::getSalary))));
		
		
		int a=10,b=20;
		System.out.println(a + b +"is ");
		System.out.println("a + b +is " + a + b);
		char[] ar = {'a', '1', 'b', '2', 'c', '3', 'd', '4', 'e', '5'};
		System.out.println(new String(ar).chars().mapToObj(c->(char)c)
		.filter(Character::isDigit).collect(Collectors.toList()));
		Arrays.stream( new String(ar).split("")).forEach(System.out::println);;
		//Character
		
		
		
		
	}

}

