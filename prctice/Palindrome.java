package prctice;


public class Palindrome {
	
	public static void main(String[] args) {
		String s="madam";
		//char[] ch = s.toCharArray();
	int c=0;
	int j=s.length()-1;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==s.charAt(j--))
			c++;
	}
	if(c==s.length()) System.out.println("palindrome");
		
		 String inputString = "madam";

	        StringBuilder isPalindrome = new StringBuilder(inputString);
	        String string = isPalindrome.reverse().toString();
	                     
	        if(string.equals(inputString))
	        System.out.println("Is Palindrome: " + isPalindrome);
	        
	        char[] arg = {'a','s','h'};
	        String ar= new String(arg);
		
	}

}
