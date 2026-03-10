package prctice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Findsecondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int larg=0,secondlarg=0;
		int [] arr= {10, 5, 8, 20, 7, 15};
		for(int num:arr) {
			if(num>larg) {
				secondlarg=larg;
				larg=num; 
			}if(num>secondlarg && num!=larg)
				secondlarg=num;
			
		}
		
		 Integer seclar = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		 Integer in = Arrays.stream(arr).boxed().sorted((a,b)->b-a).skip(1).findFirst().get();
		System.out.println("second largest num java8 "+in);
		System.out.println("second largest num "+secondlarg);
		
		
		

	}

}
