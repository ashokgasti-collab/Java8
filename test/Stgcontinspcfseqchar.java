package test;

public class Stgcontinspcfseqchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PHP Exercises and Python Exercises";
		String seq ="and";
		String[] arr = s.split(" ");
		for(String s1:arr) {
			if(s1.equals(seq)) {
				System.out.println("found");
				break;}
		}
		
		String s2="HelloThere";
		int n=s2.length()/2;
		System.out.println(s2.substring(0,n));
	}

}
