package employe;



import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class FirstNonRepeated{
  public static void main(String args[]) {
    String input = "Java articles are Awesome";
    		
    Character ch = input.chars().mapToObj(c->(char) c)
                 .collect(Collectors.groupingBy(Function.identity(),
                		 LinkedHashMap::new,Collectors.counting()))
                 .entrySet()
                 .stream()
                 .filter(e->e.getValue()==1)
                 .map(e->e.getKey())
                 .findFirst()
                 .get();
    System.out.println(ch); 
  String result = Arrays.stream(input.split(""))
  .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
  .entrySet()
  .stream()
  .filter(e->e.getValue()>1)
  .map(e->e.getKey())
  .findFirst()
  .get();
    System.out.println(result);  

    	
    	
  }
}
