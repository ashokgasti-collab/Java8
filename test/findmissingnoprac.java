package test;

public class findmissingnoprac {

	public static void main(String[] args) {
		
		//  Test cases :
	    	 
	    //    a) 1,2,3,4,5,7,8,9,10 		 n*(n+1)/2;
	  
	  //      b)2,4,6,10,12,14,16,18,20      n/2*(firsr+last)
	  
	      //  c)1,3,5,9,11,13,15,17  		 n/2*(firsr+last)
		
		int []a= { 1,2,3,4,5,7,8,9,10};
		int n=10;
		int ex=n*(n+1)/2;
		int ac=0;
		for(int num:a) {
			ac+=num;
		}
		System.out.println("missing no"+(ex-ac));
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=i+1) {
				System.out.println("missing no "+(i+1));
			break;}
		}
		int []b= { 1,3,5,9,11,13,15,17};
		int no=b.length+1;
		int exp=no*(b[0]+b[b.length-1])/2;
		int act=0;
		for(int num:b)	act+=num;
		System.out.println("missing n"+(exp-act));

	}

}
