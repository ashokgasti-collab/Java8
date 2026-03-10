package app_java_2;

import java.util.*;
public class StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence");
        String s = scan.nextLine();
        // Write your code here.
         StringTokenizer st = new StringTokenizer(s, " !,'.@?_");
         System.out.println("No of Tokens count is " + st.countTokens());
         System.out.println(st.hasMoreTokens());
         while(st.hasMoreTokens())
         {
             System.out.println("Tokens are  " + st.nextToken());
             System.out.println(st.hasMoreTokens());
         }
        scan.close();
    }
}
