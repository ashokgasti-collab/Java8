package node;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class Examp {
	
	public static void main(String[] args) {
		Node l1= new Node(1);
		l1.next=new Node(2);
		l1.next.next=new Node(3);
		print(l1);
		String s="GoogLe";System.out.println(s.toLowerCase());
		List<Entry<Character, List<Character>>> unique = s.chars().mapToObj(e->(char)e)
				 .collect(Collectors.groupingBy(Function.identity(),Collectors.toList()))
				 .entrySet()
				 .stream()
				 .filter(e->e.getValue().size()>1)
				 .collect(Collectors.toList());
		System.out.println("unique chars "+unique);
		
		Character caps = s.chars().mapToObj(e->(char)e)
		 .filter(Character::isLowerCase)
		 .findFirst()
		 .get();
		System.out.println("lcaps "+caps);
		
		List<Integer>list1 = Arrays.asList(1,2,4);
		List<Integer>list2 = Arrays.asList(1,3,4);
		List<Integer> sortlist = Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
		System.out.println("sortlist "+sortlist);
		
		int[]a1= {2,4,5};int[]a2= {2,6,5};
		List<Integer> so = Stream.concat(Arrays.stream(a1).boxed(), Arrays.stream(a2).boxed()).sorted().collect(Collectors.toList());
		System.out.println("sort "+so);
	}

	private static void print(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		
	}

}
