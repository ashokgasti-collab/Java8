package code;

class Linklist {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.insert(10);

		list.insert(20);

		list.insert(30);
		list.insert(-1);

System.out.println("ll "+list);
		list.display();

		}

		}


		class Node{

		int data;

		Node next;


		public Node(int data){

		this.data = data;

		this.next = null;

		}

		}


		class LinkedList{

		Node head;


		public void insert(int data){

		Node newNode = new Node(data);

		if(head == null){

		head = newNode;

		} else {

		Node temp = head;

		while (temp.next != null){

		temp = temp.next;

		}

		temp.next = newNode;

		}

		}

		public void display(){

		Node temp = head;

		while(temp != null){

		System.out.print(temp.data + " -> ");

		temp = temp.next;
		}

		System.out.println("null");

		}
}
