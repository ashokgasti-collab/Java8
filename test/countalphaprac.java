package test;

import java.util.HashMap;

public class countalphaprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Capgemini";
		HashMap<Character, Integer> map = new HashMap<>();
		 
		for(char c:s.toCharArray()) map.put(c, map.getOrDefault(c, 0)+1);
		System.out.println(map);
	}
		

}
