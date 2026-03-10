package app_java_2;

import java.util.Arrays;

public class Sortnum {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,8,5,9,1,7};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		int [] b= new int[a.length];
		for(int i:a)System.out.println(i);
		System.out.println("after sort "+Arrays.toString(a));

	}

}
