package app_java_2;
import java.util.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.HashSet;
import java.util.List;
public class HashSet1 {
	  
	public static void main(String[] args) {
// TO GET A DISTINCT INTEGER FROM ARRAY LIST ELEMENTS
		
	List<Integer> a=Arrays.asList(1,2,3,3,2,5,5,6,3);
	HashSet <Integer> set = new HashSet<>();
	 HashSet<Integer> set1 = new HashSet();
	 HashSet<Integer> set2 = new HashSet();
	
	 //----------using inbiult metod in for loop
	  Map<Integer,Integer> freqmap = new HashMap<>();
	 for(int n:a)
		 freqmap.put(n, freqmap.getOrDefault(n, 0)+1);
	 System.out.println("freq MAP "+freqmap);
	 
	for(int i = 0 ; i <a.size() ; i++){

	    if(!set.contains(a.get(i))) 
	    	set.add(a.get(i));

	    else set2.add(a.get(i));
	}
	
	Iterator<Integer> it = set.iterator();
	while (it.hasNext()) {
		 int i = it.next();
	   System.out.println(i);
	   
	  	} 
	
	 for (int i=0;i<a.size();i++) {
		   set1.add(a.get(i));
	   }
	System.out.println(set1);
	///----------------   SECOND APPOACH -- ------------------------------  
	  // Collections.sort(a);
	    int  unquie= 0,i = 0;
	    Map<Integer,Integer> map = new HashMap<>();
	    for(int v : a){
	        if(!map.containsKey(v)){
	            map.put(v,0);
	            
	            }
	        else if(map.containsKey(v)){
	         
	            map.put(v,1);
	            i=0;
	            }
	    }
	    System.out.println("size"+map.size());  
		System.out.println(map);  
	    for(Map.Entry<Integer,Integer> v  : map.entrySet()) {
	    	    //	System.out.println(v);
	    	    	
	        if(v.getValue()==0){
	            unquie=v.getKey(); 	
	            System.out.println(unquie);
	        }
	    }
	   
}
}
