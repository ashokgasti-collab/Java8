package app_java_2;
import java.util.Scanner;
public class Anagam {

	    static boolean isAnagram(String a, String b) {
	        // Complete the function
	    	 String newA = a.toUpperCase();
	    	 String newB = b.toUpperCase();
	       char [] c1 = newA.toCharArray();
	       char [] c2 = newB.toCharArray();
	       char temp;
	       for(int i=0;i<c1.length;i++){
	           for(int j=0;j<c1.length-1;j++){
	               if(c1[j]>c1[j+1]){
	                   temp=c1[j];
	                   c1[j]=c1[j+1];
	                   c1[j+1]=temp;
	               }
	           }
	       }
	       System.out.println(new String(c1));
	       for(int i=0;i<c2.length;i++){
	           for(int j=i+1;j<c2.length;j++){
	               if(c2[i]>c2[j]){
	                   temp=c2[i];
	                   c2[i]=c2[j];
	                   c2[j]=temp;
	               }
	           }
	       }
	       System.out.println(new String(c2));
	       String s1= new String(c1);
	       String s2= new String(c2);
	        boolean bool=s1.equals(s2);
	         return bool;
	          
	    }
	    public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	}

