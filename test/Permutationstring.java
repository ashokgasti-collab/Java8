package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutationstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		permute(str,"");
	
	  
	}

	private static void permute(String str, String prfix) {
		if(str.isEmpty())
		System.out.println(prfix);
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			String remain=str.substring(0, i)+str.substring(i+1);
			permute(remain, prfix+ch);
		}
	}

}
