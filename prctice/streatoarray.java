package prctice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class streatoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[] squares = IntStream.rangeClosed(1, 5)
                         .map(i -> i * i)
                         .toArray();

			System.out.println(Arrays.toString(squares));

		List<String> list = Arrays.asList("hello", "world");

// Stream -> String[]
		String[] arr = list.stream()
                   .map(String::toUpperCase)
                   .toArray(String[]::new);

				System.out.println(Arrays.toString(arr));

	}

}
