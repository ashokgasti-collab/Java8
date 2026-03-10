package app_java_2;

import java.util.Scanner;

public class Amstrong {
	
static boolean isAmstrong(int num) {
		int temp,digit=0,last=0,sum=0;
	//to find number of digits in number
			temp=num;
			System.out.println("temp0 "+temp);

	while(temp>0)
	{
		temp=temp/10;
		digit++;
	}
	//to find last digit from number
	
	temp=num;
	System.out.println("temp "+temp);
	while(temp>0)
	{
		last=temp%10;
//calculates the power of a number up to digit times and add the resultant to the sum variable  
		sum +=  (Math.pow(last, digit)); 
		temp=temp/10;
	}
	if(num==sum) 
	return true;
	else
	return false;
	
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Ente the number");
		int num= scan.nextInt();
		//System.out.println(5%5);
		if(isAmstrong(num)) {
			System.out.println("Given num is amsrong");
		}
		else
			System.out.println("Not Amstrong numer");
		
	}
}
