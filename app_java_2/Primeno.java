package app_java_2;

import java.util.Scanner;

public class Primeno {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ente the number");
		int num= scan.nextInt();
		
		if(isPrime(num)) {	
		System.out.println("Given number " +num+" is prime");
		}
		else {
			System.out.println("Given number " +num+" is not prime");
		}
	}

	private static boolean isPrime(int num) {
		boolean flag=true;
		for(int i=2;i<num/2;++i) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	
	}

}
