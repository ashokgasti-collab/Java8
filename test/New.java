 package test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]a1= {2,7,11,15,2};
		int target=9;
		Set<Integer> s= new HashSet<Integer>();
		
		for(int e:a1) {
			int comp=target-e;
			
			if(s.contains(comp)) {
				
				System.out.println("pair found:"+comp+","+e);
			}
			s.add(e);
		}
		
		
		
		
		
		
		
		
		
		
//		for(int e:a1) {
//			int comp=target-e;
//		
//			if(s.contains(comp)) 
//			{
//				System.out.println("pair found "+comp+","+e);
//				
//			}
//			s.add(e);
//			
//		}
		
		}
		
		
	}


