package practice;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ash1";
		for(int i=0;i<s.length();i++) {
			boolean b = Character.isDigit(s.charAt(i));
			if(b) System.out.println("number");
			else System.out.println("not number");
			
		}
		String str="i am rajesh kumar ravi";
		 
		 String longest="";
		 int maxlength=0;
		 String[] s1 = str.split("a");
		 for(String s2:s1) {
			 if(s2.length()>maxlength) {
				 maxlength=s2.length();
				 longest=s2;
			 }
			 
		 }
		 System.out.println(longest + " "+maxlength);

	}

}
