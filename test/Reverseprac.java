package test;

import java.util.Arrays;

public class Reverseprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Capgemini Training";

		Arrays.stream(s.split(" "))
		.map(e->new StringBuffer(e).reverse()+" ").forEach(e->System.out.print(e));
		
		int num=3034;
		String s1 = String.valueOf(num);
		System.out.println(new StringBuffer(s1).reverse());
		StringBuilder sb= new StringBuilder();
	}

}
