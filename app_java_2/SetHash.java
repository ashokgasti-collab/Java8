package app_java_2;
import java.util.*;
import java.util.HashSet;

public class SetHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array of 2 strings");
		int t = sc.nextInt();
		String [] left_pair = new String[t];
		String [] right_pair = new String[t];
		System.out.println("Enter left and right pair strings");
		for(int i=0;i<t;i++) {
			left_pair[i] = sc.next();
			right_pair[i] = sc.next();
		}
		Set <String> st = new HashSet<>();
		for(int i=0;i<t;i++) {
			st.add(left_pair[i]+" "+right_pair[i]);
			}
		System.out.println("Count of unique pair set is");
		System.out.println(st.size());
		sc.close();
	}

}
