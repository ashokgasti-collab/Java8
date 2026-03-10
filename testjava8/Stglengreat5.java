package testjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stglengreat5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = Arrays.asList("ashokg","gasthi","kumar");
		l.stream().filter(e->e.length()>5).forEach(e->System.out.println(e));
		String c = l.stream().collect(Collectors.joining("-"));
		System.out.println(c);
	}

}
