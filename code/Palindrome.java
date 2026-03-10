package code;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class ListNode{
	char data;
	ListNode next;
	ListNode(char data){
		this.data=data;
		this.next=null;
	}
}

public class Palindrome {
	
static void print(ListNode head) {
	ListNode temp=head;
	
	while(temp!=null) {
		System.out.print(temp.data+"->");
		
		temp=temp.next	;
		
	}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> l=new LinkedList<Character>();
		
		ListNode l1= new ListNode('p');
		l1.next=new ListNode('o');
		l1.next.next=new ListNode('p');
		
		System.out.println("ll"+l);
		print(l1);
		
		
//		LinkedList<Character> l=new LinkedList<Character>();
//		l.add('p');
//		l.add('o');
//		l.add('p');
//		LinkedList<Character> l2=new LinkedList<Character>(l);
//		Collections.reverse(l2);
//		System.out.print(Collections.reverse((List<?>) l1));
//		System.out.println(l.equals(l2));
	}

}
