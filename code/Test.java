package code;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
		public static void main (String [] args) {
		String str = "abc";
		String s="a";
	
		int x = 5;
		int y = 10;
		x = y++;
		System.out.println(x + " " + y);
		//System.out.println(str.substring(0,0));
		permute(str,"");
		}

		private static void permute(String str, String prefix) {
			if(str.isEmpty())
				System.out.println(prefix);
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				String remain=str.substring(0,i)+str.substring(i+1);
				//System.out.println(remain);
				permute(remain, prefix+ch);
			}
			
		}
	}


