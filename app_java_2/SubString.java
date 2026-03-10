package app_java_2;

public class SubString {
	public static void main(String[] args) {
		String s="welcometojava";
		int k=5,l=s.length(),size=l-k+1;
		String[] c=new String[size];
		for(int i=0;i<size;i++)
		{
			c[i]=s.substring(i, i+k);
		}
		System.out.println("Before sort:"+ " ");
		for (String r : c)
		{
			System.out.print(r+" ");
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-1-i;j++) {
				if (c[j].compareTo(c[j+1]) > 0 )
				{
					String temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
				}
			}
		}
		/*for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if (c[i].compareTo(c[j]) > 0 )
				{
					String temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}*/
		System.out.println("\n after Bubbl sort:"+ " ");
		for (String r : c)
		{
			System.out.print(r+" ");
		}
		System.out.println("\n last element " +c[size-1]);
	}
}
