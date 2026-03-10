package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class occurrofletterprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				if(mp.getValue()>1) System.out.println(mp.getKey());
		String s="naveen";
		Map<Character,Integer>m=new HashMap<>();
		for(char c:s.toCharArray())
			m.put(c, m.getOrDefault(c, 0)+1);
			for(Map.Entry<Character, Integer> mp:m.entrySet()) {
				if(mp.getKey()=='H') System.out.println(mp.getValue());
				}
				
			}
			

	}


