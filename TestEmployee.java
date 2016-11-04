
public class TestEmployee {

	public static void main(String[] args) {
		Employee employee1 = new Employee(101, "Ravi", 25544.34);
		
		Employee emp = new Employee();
	/*	employee1.id = 101;
		employee1.name = "Ravi";
		employee1.salary = 23423.77;*/
		
		
		Employee employee2 = new Employee(102, "Priya", 34454.4);
		/*employee2.id = 102;
		employee2.name = "Ravi";
		employee2.salary = 23423.77;*/
		
		
		System.out.println(employee1.name);
		System.out.println(employee2.name);
		
		System.out.println(employee1.salary);
		employee1.incrementSalary();
		System.out.println(employee1.salary);
	}

}
