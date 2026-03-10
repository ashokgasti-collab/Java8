package employe;


import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class FirstRepeated{
  public static void main(String args[]) {
    String input = "Java articles are Awesome";
    
    String r = input. replaceAll(" ", "");
    String g = input.replaceFirst(" ","");
    String f = input.replace(" ","");
    System.out.println(r);
    LinkedHashMap<String, Long> c = Arrays.stream(input.split(""))
    .map(String::toLowerCase)
    .collect
    (Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));
    System.out.println(c);
    
    Optional<Character> result = input.chars()
            .mapToObj(s -> (char) s)
            .map(Character::toLowerCase)
            .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1L)
            .map(e->e.getKey())
            .findFirst();
            
if (result.isPresent()) {
    System.out.println(result.get());
} else {
    System.out.println("No character occurs more than once.");
}

	LinkedHashMap<Character, Long> ch = r.chars()
    .mapToObj(s -> (char) s)
    .map(Character::toLowerCase)
   .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));

        System.out.println(ch);
            
     

    	
    	
  }
}

