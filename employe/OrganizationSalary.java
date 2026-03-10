package employe;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class OrganizationSalary {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000));
        employees.add(new Employee("Alice", 60000));
        employees.add(new Employee("Mike", 45000));
        employees.add(new Employee("Emily", 55000));

        double totalSalary = employees.stream()
                .mapToDouble(Employee::getSalary).max().getAsDouble();
               // .sum();
               // .reduce(0, Double::sum);

        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();
        
     
        //find top 2 highest salay
        		 employees.stream()
        			.sorted(Comparator.comparing(Employee::getSalary).reversed())
        			.limit(2).forEach( System.out::println);
        
        //find first highestst salayr
         Employee employee = employees.stream()
           	.sorted(Comparator.comparing(Employee::getSalary).reversed())
           		.findFirst().get();
        		 System.out.println(employee);
        
      //  find first highestst salayr
        		 System.out.println(employees.stream()
        		.max(Comparator.comparing(Employee::getSalary)).get());
        				
        System.out.println("Total Salary: " + totalSalary);
        System.out.println("Average Salary: " + averageSalary);
    }
}


