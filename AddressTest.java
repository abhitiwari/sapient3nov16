
public class AddressTest {

	public static void main(String[] args) {
		Address add = new Address(23,"GK", "New Delhi", 110026);
		/*String address = add.houseNumber + ", " + add.locality + " " + add.city;
		System.out.println(address);*/
		add.print();
		System.out.println(add);
		
		Address add1 = new Address(43,"Jangpura", "New Delhi", 110014);
		/*String address1 = add1.houseNumber + ", " + add1.locality + " " + add1.city;
		System.out.println(address1);*/
		add1.print();

	}

}
