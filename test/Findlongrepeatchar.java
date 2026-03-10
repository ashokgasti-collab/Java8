 package test;

public class Findlongrepeatchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabbccc";
	String longsq="",cursq="";
	for(int i=0;i<s.length();i++) {
		if(cursq.length()==0)		cursq+=s.charAt(i);
		else {
			if(s.charAt(i)==cursq.charAt(cursq.length()-1))   cursq+=s.charAt(i);
			else {
				if(cursq.length()>longsq.length()) longsq=cursq;
				cursq=""+s.charAt(i);
			}
			
		}
	}
		if(cursq.length()>longsq.length()) longsq=cursq;
		System.out.println(longsq);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String curr="",longs="";
//		for(int i=0;i<s.length();i++) {
//			if(curr.length()==0)
//				curr+=s.charAt(i);
//			else {
//				if(s.charAt(i)==curr.charAt(curr.length()-1)) {
//					curr+=s.charAt(i);
//				System.out.println(curr);}
//				else {
//					if(curr.length()>longs.length()) longs=curr;
//					curr=""+s.charAt(i);
//				}
//				
//			}
//		}
//		if(curr.length()>longs.length()) longs=curr;
//		System.out.println("longestrepeatedchar :"+longs);
	}

}
