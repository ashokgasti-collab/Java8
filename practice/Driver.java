package practice;

 

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

		empList.add(new Employee(5, "abc", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
		
		System.out.println(" Calculate sum of those employee salary whose age > 25 :: \n" +
				empList.stream().filter(e->e.getAge()>25).collect(Collectors.summingLong(e->e.getSalary())));
		
		System.out.println("Employees soted by name &age :: \n" +
		empList.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName)).collect(Collectors.toList()));
		
		//list of employee with age and name, sort based on age using groupingBy
	System.out.println("$$$$$$$$$$"+empList.stream().sorted((a,b)->a.getAge()-b.getAge()).collect(Collectors.toList()));
	//empList.stream().collect(Collectors.groupingBy(Employee::getCity),Collectors.mapping(Employee::getSalary),Collectors.mapping(Employee::getSalary,);
		
		Map<String, List<Employee>> empByCity;
		empByCity = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		System.out.println("Employees grouped by city :: \n" + empByCity);
		Map<String, Double> avgAge =
		empList.stream().collect(Collectors.groupingBy(Employee::getGender,
				Collectors.averagingInt(Employee::getAge)));
		System.out.println("Average age of Male and Female Employees::\n " + avgAge);
		Map<String, Long> countByDept=
		empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
				Collectors.counting()));
		System.out.println("No of employees in each department\n"+countByDept);
		long lo=0;String key="";
		for(Map.Entry<String, Long>m:countByDept.entrySet()) {
			if(lo<m.getValue())
				lo=m.getValue();
			 key = m.getKey();
			
		}
		 System.out.println(lo+key);
		
		Employee oldestEmployee=
		empList.stream().max((a,b)->a.getAge()-b.getAge()).get();
		System.out.println("Oldest employee details:: \n" + oldestEmployee);
		
		empList.stream().filter(e->e.getAge()>25 && e.getAge()<30)
		.forEach(e->System.out.println("Employees whose age is greater than 25 and less than 30:\n"+e));;
		Map.Entry<String, Long> maxNoOfEmployeesInDept =
		empList.stream()
		.collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()))
		.entrySet()
		.stream()
		.max(Map.Entry.comparingByValue()).get();
		System.out.println("Max no of employees present in Dept ::\n " + maxNoOfEmployeesInDept.getKey()+"-"+ maxNoOfEmployeesInDept.getValue());
		System.out.println("No of employees in the organisation :: " + empList.stream().count());
		DoubleSummaryStatistics empSalary = 
				empList.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));							
		System.out.println("doub \n"+empSalary);
		System.out.println("Average Salary in the organisation = " + empSalary.getAverage());
		System.out.println("Total Salary in the organisation  = " + empSalary.getSum());
		System.out.println("Maxi Salary in the organisation  = " + empSalary.getMax());
		Map<String, Double> AverageSalDept =
				empList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,
				Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("Print Average salary of each department"+AverageSalDept);
		
		Map<String, Optional<Employee>> highestPaidMFEmployee  = empList
		.stream()
		.collect(Collectors.groupingBy(Employee::getGender,
				Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		System.out.println("Highest paid male and female employee : " + highestPaidMFEmployee);
		
		
		//Map<String, Optional<Employee>> highestPaidDeptEmployee  =
				Map<String, Optional<Long>> highestPaidDeptEmployee = empList
				.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,
				Collectors.mapping(Employee::getSalary,Collectors.maxBy(Comparator.naturalOrder()))));
				System.out.println("Highest paid Dept employee : " + highestPaidDeptEmployee);
		//second method		
				Map<String, Optional<Employee>> highpaidemp = empList.stream()
						.collect(Collectors.groupingBy(Employee::getDeptName, 
						Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
				
				System.out.println("Highest paid Dept employee : \n" + highpaidemp);
				
				System.out.println("Highest second salary dept wise:: \n" + empList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,
		                   Collectors.collectingAndThen(Collectors.toList(),
		                   list -> list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst()))));
				
				System.out.println("Sorting the department wise employee salary in ascending order:: ");
				Map<String, Stream<Employee>> sortedEmployeeAsc = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, 
				                                                   Collectors.collectingAndThen(Collectors.toList(),
				                                                   list -> list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)))));

				sortedEmployeeAsc.forEach((k,v)->{
				            System.out.println(k);
				            System.out.println(v.collect(Collectors.toList()));
				        });
		System.out.println("\n Sorting the department wise employee salary in desecning order:: ");
			empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
					Collectors.collectingAndThen(Collectors.toList(), l->l.stream().sorted(Comparator.comparing(Employee::getSalary)))))
					.forEach((k,v)->System.out.println(k+v.collect(Collectors.toList())));
				
				System.out.println("\n Top 3 male employee salary haveing age 20-30 in each dept:: ");			
				empList.stream()
				.filter(e->e.getGender().equalsIgnoreCase("M"))
				.filter(e->e.getAge()>20&&e.getAge()<30)
				.collect(Collectors.groupingBy(Employee::getDeptName,	
			Collectors.collectingAndThen(Collectors.toList(),
			l->l.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3))))
				.forEach((k,v)->System.out.println(k+v.collect(Collectors.toList())));;
				
				Map<String, List<Employee>> top3 = empList.stream()
				.filter(e->e.getGender().equalsIgnoreCase("M"))
				.filter(e->e.getAge()>20&&e.getAge()<30)
				.collect(Collectors.groupingBy(Employee::getDeptName));	
				System.out.println("\n ANTHOR METHOD Top 3 male employee salary haveing age 20-30 in each dept:: ");
				top3.forEach((k,v)->{
					List<Employee> va = v.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList());
					System.out.println(k+va);
				});
			
				
		//peek method
				List<String> p = empList.stream()
				.peek(e->{if(e.getYearOfJoining()<2011)
					e.setSalary((long) (e.getSalary()*1.10));
					
				}).map(e->e.getName()+":"+e.getSalary())
				.collect(Collectors.toList());
				System.out.println("\n increase sal by 10 % if doj before 2011"+p);
				
				
	}
	

}

