package employe;



import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestNotes {

    public static void main(String[] args) { 
      List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
      List<Integer> i = Arrays.asList(2,4,1,7);
     List<Integer> s = i.stream().sorted().collect(Collectors.toList());
     System.out.println(s);
      i.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
     i.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
     i.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).forEach(System.out::println);
	Map<String, Long> c = names.stream().filter(x->Collections.frequency(names,x)>1)
      .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    		  System.out.println(c);
  }
}
