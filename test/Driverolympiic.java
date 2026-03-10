package test;


import java.util.HashMap;

import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;





public class Driverolympiic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  o/p: calculate the total
		 //medal count for each country and display the results.
		List<Olympics> olympicsList = List.of(
				 
				   new Olympics("USA", "Swimming", 5),
				 
				   new Olympics("USA", "Athletics", 3),
				 
				   new Olympics("China", "Table Tennis", 4),
				 
				   new Olympics("China", "Badminton", 2),
				 
				   new Olympics("India", "Wrestling", 1),
				 
				   new Olympics("India", "Shooting", 2)	
				 
				);
		//empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
	
	System.out.println(olympicsList.stream().collect(Collectors.groupingBy(Olympics::getCountry,Collectors.summingInt(Olympics::getMedal))));;
		
		Map<String, Integer> medalCount = new HashMap<>();
		for(Olympics o:olympicsList) {
			medalCount.put(o.getCountry(), medalCount.getOrDefault(o.getCountry(), 0)+o.getMedal());
		}

		System.out.println(medalCount);
	}
	}
		 
		
	

