package employe;



public class Emp {
	private String name;
    private int salary;
    private String dept;
    private int age;
	public Emp(String name, int salary, String dept, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String getDept() {
		return dept;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + ", dept=" + dept + ", age=" + age + "]";
	}
    

}

