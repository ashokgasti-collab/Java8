package app_java_2;

public class RemoveDupli {

	public static void main(String[] args) {
		int [] a= new int []{1,1,2,2,3,4,5,5};
		int [] t=new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				t[j]=a[i];
				j++;
			}
		}
		t[j]=a[a.length-1];
		for(int k:t)
		{
			System.out.println(k);
		}
	}

}
