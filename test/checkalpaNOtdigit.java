package test;

public class checkalpaNOtdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ashok";
		char[] arr = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			char t=arr[i];
			if(Character.isDigit(t)) {
				System.out.println("string contain digits");
				break;}
			 
		}
		System.out.println("it is string");

	}

}
