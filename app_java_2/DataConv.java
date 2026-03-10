package app_java_2;

public class DataConv {

	public static void main(String[] args) {

		
		String w = "13";
		int n = Integer.parseInt(w);
		String q = Integer.toString(n);
		;
		
		System.out.println("strng and int are:" + q + n);
		
//---------Reverse a string-----
		String s = "I Love Computer Science";
		char[] revstg = s.toCharArray();
		for(int i=revstg.length-1;i>=0;i--) {
			System.out.print(revstg[i]);
		}
		System.out.println();
		//second methodto-------- reverse string--------------------
		for(int i=s.length()-1;i>=0;i--)
			System.out.print(s.charAt(i));
		
	}
}
