package app_java_2;
//import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter string");
	        String A=sc.next();
	        sc.close();
	        int p=A.length()-1,t=0;
	        for(int i=0;i<A.length();i++) {
	        	if(A.charAt(i)==A.charAt(p--))
	        		t++;
	        }
	        if(t==A.length())
	        System.out.println("palindrome");
	        /* Enter your code here. Print output to STDOUT. */
	        char [] c = A.toCharArray();
	   //     Arrays.sort(c);
	        int j=c.length-1,count=0;
	        for(int i=0;i<c.length;i++)
	        {
	                if(c[i] == c[j--])
	                  count++;
	        }
	        if(count == c.length)
	        System.out.println("Yes Palindrome");
	        else
	        System.out.println("No");
	    }
	}






