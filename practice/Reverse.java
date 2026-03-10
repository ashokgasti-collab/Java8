package practice;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "hi world how are you";
		String s2="";
		StringBuilder sb1= new StringBuilder();
		for(int i=s.length()-1;i>=0;i--) {
			s2=s2+s.charAt(i);
		}
		System.out.println(s2);
		StringBuilder sb= new StringBuilder(s);
		System.out.println(sb.reverse());
		
		String[] sp = s.split(" ");
		for(int i=sp.length-1;i>=0;i--) {
			System.out.print(sp[i]+" ");
		}
		String o="";
		for(String s1:sp) {
			String rev=" ";
			for(int i=s1.length()-1;i>=0;i--) {
				rev=rev+s1.charAt(i);
			}
			o=o+rev;
		}
		System.out.println(o);

	}

}
