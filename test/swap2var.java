package test;

public class swap2var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=4;
		 a=a+b;
		 b= a-b;
		 a=a-b;
		System.out.println(a+" "+b);

		String s1="first";
		String s2="second";
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		System.out.println(s2);
		s1=s1.substring(s2.length());
		System.out.println(s1);
	}

}
