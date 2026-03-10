package practice;

import java.util.Arrays;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub----{ tgt=t}
		String s= "opentext";
		System.out.println(s.indexOf('t'));
		int d=1;
		StringBuffer sb=new StringBuffer(s);
		for(int i=0;i<s.length();i++) {
			if(sb.charAt(i)=='t') {
				sb.setCharAt(i, (char)(d + '0'));
				d++;
			}
		}
		System.out.println(sb);
		
//		char[] c = s.toCharArray();
//		int o=1;
//		for(int i=0;i<c.length;i++) {
//			if((c[i])=='t'){
//			c[i]=String.valueOf(o).charAt(0);
//			o++;
//			}
//		}
//		  System.out.println( Arrays.toString(c));
//		  
		int c=1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='t') {
				s=s.replaceFirst(String.valueOf(s.charAt(i)), String.valueOf(c));
				c++;
				
			}
		}
		System.out.println(s);
	}
	 
		 
}
