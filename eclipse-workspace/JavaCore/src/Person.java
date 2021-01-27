
public class Person {
	public static final String FIRSTNAME = "No FirstName";
	public static final String LASTNAME = "No LastName";
	public static final byte AGE = 0;
	public static final Address ADDRESS = new Address();
	public static short count = 0;
	private String firstName;
	private String lastName;
	private byte age;

	private Address address;

	// constructor method
	public Person() {
		this(Person.FIRSTNAME, Person.LASTNAME, Person.AGE, Person.ADDRESS);
	}

	public Person(byte a) {
		this(Person.FIRSTNAME, Person.LASTNAME, a, Person.ADDRESS);
	}
	
	public Person(String firstName, String lastName, byte age, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		//this.address = address;//gan gia tri dia chi cho bo nho
		this.address = new Address(address);// tao moi 1 khong gian bo nho de luu gia tri(nen dat)
		Person.count++;
	}
	
	public Person(Person per) {
		this(per.getFirstName(),per.getLastName(),per.getAge(),per.getAddress());
	}
	// getter methods
	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public byte getAge() {
		return this.age;
	}

	public Address getAddress() {
		return this.address;
	}

	public String getStringAddress() {
		return this.address.toString();
	}

	// Setter methods
	/*
	 * public void setFirstName(String firstName) { this.firstName = firstName;
	 * return; } public void setLastName(String lastName) { this.lastName =
	 * lastName; return; } public void setAge(byte age) { this.age = age; return; }
	 */
	public Person setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public Person setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public Person setAge(byte age) {
		this.age = age;
		return this;
	}

	public Person setAddress(Address address) {
		this.address = address;
		return this;
	}

	public Person setAddress(String cityName, String districtName, String streetName) {
		this.address = new Address(cityName, districtName, streetName);
		return this;
	}

	// other methods
	public String toString() {
		// LA phuong thuc lay ra tat ca du lieu cua doi tuong
		return this.lastName + " " + this.firstName + "," + this.age + " - " + this.address.toString();
	}

	public static void main(String[] args) {
		// Tao doi tuong dia chi
		Address addr = new Address("NA", "CL", "NTT");

		//Person p;
		Person p1 = new Person();
		Person p2 = new Person((byte) 20);
		Person p3 = new Person("Thien", "Nguyen Thanh", (byte) 20, addr);

		// Xuat thong tin doi tuong
		/*
		 * p1.setFirstName("Thien"); p1.setLastName("Nguyen Thanh");
		 * p1.setAge((byte)20);
		 */
		p1.setLastName("Nguyen Thanh").setFirstName("Thien").setAge((byte) 20);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		//Sua dia chi
		addr.setStreetName("NGT");
		System.out.println(p3);
	}
}
