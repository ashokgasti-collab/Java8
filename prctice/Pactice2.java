package prctice;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Pactice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaawwwbaacc";
		String []s1={"aaaaa","wwwb", "aa"};
		String collect = Arrays.stream(s1).collect(Collectors.joining());
		System.out.println(collect);
		
		List<Entry<Character, Long>> maps = s.chars()
		.mapToObj(e->(char)e)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		//.sorted(Map.Entry.<Character,Long>comparingByKey().reversed())
		.sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toList());
		System.out.println("sorted maop "+maps);
		StringBuilder sb= new StringBuilder();
		int cnt=1;
		for (int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			if(i<s.length()-1&&c==s.charAt(i+1)) {
				cnt++;
			}else if(c != ' '){
				 
				sb.append(c);
				sb.append(cnt);
				cnt=1;
				
			}
		}
		System.out.println(sb.toString());
		System.out.println(s.chars().filter(e->!Character.isWhitespace(e)).count());
		int sum=0;
	for(int i=0;i<sb.length();i++) {
		char c = sb.charAt(i);
		
		if(Character.isDigit(c)) {
		sum+=	Character.getNumericValue(c);
					
		}
		
	}
	System.out.println(sum);
	}
}
//
//

