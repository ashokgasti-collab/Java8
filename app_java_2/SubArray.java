package app_java_2;
import java.util.Scanner;
public class SubArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of Array");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();int [] a= new int[n];
				for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
				sc.close();
		int count=0;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i;j<a.length;j++)
			{
				int sum =0;
				for(int k=i;k<=j;k++)
				{
					sum+=a[k];
				}
			if(sum<0)
				count++;
		}
	  }
		System.out.println("No of Subarrays have Negative count "+count);
	}

}
