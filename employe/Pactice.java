package employe;



import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Pactice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {9,10,15,8,49,25,98,32,10};
	
		
		//print even no's from list
List<Integer> list = Arrays.stream(arr)
					.boxed()
					.filter(e->e%2==0).collect(Collectors.toList());
					System.out.println(list);
		
		//find first element from list---9
		int i = Arrays.stream(arr).findFirst().getAsInt();
		System.out.println(i);
		//find the duplicate in list----10
		Set<Integer>set= new HashSet<>();
		Arrays.stream(arr)
		.filter(s->!set.add(s))
		.forEach(System.out::println);
		System.out.println();
		//pint odd and evan list
		Arrays.stream(arr).boxed()
		.collect(Collectors.groupingBy(e->e%2==0?"Even":"Odd"))
		//.entrySet().stream()
		//.forEach(System.out::println);
		.forEach((c,v)->{System.out.println(c+":"+v);});
		System.out.println();
		//print nos start with 1
		System.out.println("print nos start with 1");
		Arrays.stream(arr).boxed()
		.map(e->e+"")
		.filter(e->e.startsWith("1"))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		//find max and min
		System.out.println("Max val: "+Arrays.stream(arr).max().getAsInt());
		System.out.println("Max val: "+Arrays.stream(arr).boxed().max(Integer::compare).get());
		System.out.println("Min val: "+Arrays.stream(arr).min().getAsInt());
		
		//find first non repeated character
		String input="first non repeated character";
		 String s = Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e->e.getValue()==1)
		.map(e->e.getKey())
		.findFirst().get();
		System.out.println("first non repeated character :"  +s);
		System.out.println();
		
		//hashmap for each loop iteation
		Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.forEach((c,v)->System.out.println(c+":"+v));
		
		System.out.println();
		//sort elements asc and desc order
		System.out.println("sort elements asc and desc order");
		Arrays.stream(arr).sorted().forEach(System.out::println);
		Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println();
		//find unique elements
		System.out.println("find unique elements");
		List<Integer> l=Arrays.asList(11,22,33,44,11,22);
		l.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e->e.getValue()==1)
		.map(e->e.getKey())
		.forEach(System.out::println);
		System.out.println();
		//to find duplicate elements fon string array list
		System.out.println("duplicate elements fon string array list");
		List<String> l1=Arrays.asList("abc","def","xyz","mno","pqr","def","xyz","stu");
		l1.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e->e.getValue()>1)
		.forEach(System.out::println);
		System.out.println();
		//print count of each character
		System.out.println("count of each character");
		Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.forEach((c,v)->{System.out.println(c+":"+v);});
		System.out.println();
		
		//find count of words in string input="first non repeated character";
		System.out.println("count of words in string :"+Arrays.stream(input.split(" ")).count());
		
	}

}
