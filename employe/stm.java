package employe;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int b[]= {3,4,5,6,7};
		
		
		int max1=Integer.MAX_VALUE;
		System.out.println("max"+max1);
		Set<Integer> set = new HashSet<>();
		 Map<Integer, Integer> map = new HashMap<>();	
		 List<Integer> l1 = Stream.concat(Arrays.stream(a).boxed(), Arrays.stream(b).boxed())
			  .collect(Collectors.toList());
		//"sum of +duplicate 
		 List<Integer> Dup = l1.stream().filter(e->!set.add(e)).collect(Collectors.toList());
		 System.out.println("sum of +duplicate"+Dup.stream().mapToInt(e->e).sum());
		 
		 set.clear();//"sum of unique+
		 List<Integer> Uniq = l1.stream().filter(e->set.add(e)).collect(Collectors.toList());
		 System.out.println("sum of +unique"+Uniq.stream().mapToInt(e->e).sum());
		 
//		 Stream.of(a).flatMapToInt(IntStream::of)
//				 		.collect(ArrayList::new, ArrayList::add,ArrayList::addAll);
		 List<Integer> v = Arrays.stream(a).boxed().collect(Collectors.toList());
		 
		 System.out.println( v.stream().collect
		 (Collectors.groupingBy(Function.identity(),Collectors.counting())));
		 
		 
		l1.forEach(c->map.put(c, map.getOrDefault(c, 0)+1));
		System.out.println("map"+map);
		List<Integer> amap = map.values().stream().filter(e->e<2).collect(Collectors.toList());
		System.out.println(amap);
		System.out.println(map.keySet());
		
		 int i = 15623;
		 Integer is = Arrays.stream(String.valueOf(i).split("")).map(e->Integer.parseInt(e))
				 .mapToInt(e->e.intValue()).sum();
				 //.reduce(0,Integer::sum);
		System.out.println("sum of digits"+is);
		Integer collect = Arrays.stream(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println("sum of digits "+collect);
		set.addAll(map.keySet());
		int s=0;
		for(int x:set)
			s+=x;
		System.out.println("sum of unique+duplicate "+ s);
		set.clear();
		for(Map.Entry<Integer, Integer>e:map.entrySet()) {
			if(e.getValue()==1)
			set.add(e.getKey());
			}
		
		int t=0;
		for(int x:set)
			t+=x;
		System.out.println("sum of unique "+ t);
		set.clear();
		for(Entry<Integer, Integer>e:map.entrySet()) {
			if(e.getValue()>1)
			set.add(e.getKey());
			}
		int u=0;
		for(int x:set)
			u+=x;
		System.out.println("sum of duplicate "+ u);
		set.clear();

	}

}

