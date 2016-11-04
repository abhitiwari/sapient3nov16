
public class Employee {
	
	int id;
	String name;
	double salary;
	
	Employee(){
		
	}
	
	
	
	public Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	void incrementSalary(){
		this.salary = this.salary * 1.1;
	}
	
	

}
