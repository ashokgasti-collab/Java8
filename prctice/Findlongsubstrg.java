package prctice;

import java.util.HashSet;
import java.util.Set;

public class Findlongsubstrg {

	   public static void main(String[] args) {
	        String input = "abcabcbb";
	        		//"pwwkeabkw";
	        System.out.println("Longest substring: " + longestUniqueSubstring(input));
	    }
	   static String longestUniqueSubstring(String s) {
		HashSet<Character>set = new  HashSet<>();
		int left=0,strtindx=0,maxlen=0;
		for(int right=0;right<s.length();right++) {
			while(set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			if(right-left+1>maxlen) {
				maxlen=right-left+1;
				strtindx= left;
			}
		}
		
		   
		   return s.substring(strtindx,strtindx+maxlen);
		   
	   }
	
		// TODO Auto-generated method stub
	   
	   
	   
	   
	   
	   
	   
		
//		    public static String longestUniqueSubstring(String s) {
//		        Set<Character> set = new HashSet<>();
//		        int left = 0;
//		        int maxLen = 0;
//		        int startIndex = 0;
//
//		        for (int right = 0; right < s.length(); right++) {
//		            while (set.contains(s.charAt(right))) {
//		                set.remove(s.charAt(left));
//		                left++;
//		            }
//
//		            set.add(s.charAt(right));
//
//		            if (right - left + 1 > maxLen) {
//		                maxLen = right - left + 1;
//		                startIndex = left;
//		            }
//		        }
//
//		        System.out.println("startindex:"+startIndex+"maxlen:"+maxLen);
//		        return s.substring(startIndex, startIndex + maxLen);
//		    }

		 
		

	}


