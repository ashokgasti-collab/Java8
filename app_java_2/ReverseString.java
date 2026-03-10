package app_java_2;

import java.util.Scanner;

public class ReverseString {
	 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter string");
	        String A=sc.nextLine();
	        sc.close();
	        /* Enter your code here. Print output to STDOUT. */
	        String s1="";
	        for(int i=A.length()-1;i>=0;i--) {
	        s1=s1+A.charAt(i);	
	        }
	        System.out.println(s1);
	     //   --------------------------------
	     //   second appoach
	        char [] c = A.toCharArray();
	        char[] t=new char[c.length];
	        int j=0;
	       for(int i=c.length-1;i>=0;i--) {
	        		t[j]=c[i];
	        		j++;
	        }
	        for(int i=0;i<t.length;i++)
	        System.out.print(t[i]);
	 }
}
