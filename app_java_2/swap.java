package app_java_2;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1= "ash";
String s2= "kumar";
s1=s1+s2;
s2=s1.substring(0, s1.length()-s2.length());
s1=s1.substring(s2.length());
System.out.println(s1);
System.out.println(s2);

int a=5,b=10;
a=a+b;
b=a-b;
a=a-b;
//----------second approach-----
a=a+b-(b=a);
System.out.println("a:"+a);
System.out.println("b:"+b);
	}

}
