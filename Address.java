
public class Address {
	
	int houseNumber;
	String locality;
	String city;
	int pincode;
	
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", locality=" + locality + ", city=" + city + ", pincode="
				+ pincode + "]";
	}

	public Address(int houseNumber, String locality, String city, int pincode) {
		this.houseNumber = houseNumber;
		this.locality = locality;
		this.city = city;
		this.pincode = pincode;
	}
	
	public void print(){
		String address = houseNumber + ", " + this.locality + " " + this.city;
		System.out.println(address);
	}

}
