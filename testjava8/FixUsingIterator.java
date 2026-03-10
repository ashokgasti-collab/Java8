package testjava8;

import java.util.*;

public class FixUsingIterator {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(2, 4, 6, 7, 8)
        );

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num % 2 != 0) {
                iterator.remove();  // ✅ safe removal
            }
        }

        System.out.println(numbers);
    }
}
