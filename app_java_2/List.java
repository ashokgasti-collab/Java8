package app_java_2;
import java.util.*;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of elements");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<n;i++)
		  al.add(sc.nextInt());
		System.out.println("arraylist ");
		System.out.println("Enter number of queries");
		int q= sc.nextInt();
		while(q!=0)
		{
			String s=sc.next();
			if(s.equalsIgnoreCase("Insert"))
				al.add(sc.nextInt(),sc.nextInt());
			else if(s.equalsIgnoreCase("Delete"))
				al.remove(sc.nextInt());
			q--;
		}
		for(Integer i : al)
			System.out.print(i+" ");
					
		sc.close();		
		}
	}


