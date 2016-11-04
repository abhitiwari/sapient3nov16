
public class Department {

	public static void main(String[] args) {
		String name = args[0];
		String deptNumber = args[1];

		switch (deptNumber) {

		case "1":
			System.out.println(name + " belongs to accounts dept ");
			break;
		case "2":
			System.out.println(name + " belongs to networking dept ");
			break;
		case "3":
			System.out.println(name + " belongs to finance dept ");
			break;
		}

	}

}
