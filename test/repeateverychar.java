package test;

public class repeateverychar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  o/p:wweellccoommee
		
		String s = "welcome";
		String temp="";
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			temp+=String.valueOf(c)+String.valueOf(c);
				
		}
		System.out.println(temp);
	}

}
