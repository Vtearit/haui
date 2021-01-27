package jSE;

public class Person {
	// Constants
	public static final String FIRSTNAME = "No FirstName";
	public static final String LASTNAME = "No LastName";
	public static final byte AGE = 0;
	public static final Address ADDRESS = new Address();

	// Class's variables
	private static short count = 0;

	// Object's properties
	String firstName;
	String lastName;
	byte age;

	private Address address;

	// Constructor methods
	public Person() {
		// Đặc biệt loại 1
		// this.firstName = "No FirstName";
		// this.lastName = "No LastName";
		// this.age = 0;

		// this("No FirstName", "No LastName", (byte)0);
		this(Person.FIRSTNAME, Person.LASTNAME, Person.AGE, Person.ADDRESS);
	}

	public Person(byte age) {
		// Bình thường
		// this.firstName = "No FirstName";
		// this.lastName = "No LastName";
		// this.age = age;

		this(Person.FIRSTNAME, Person.LASTNAME, Person.AGE, Person.ADDRESS);
	}

	public Person(String f, String l, byte age, Address address) {
		// Đặc biệt loại 2
		this.firstName = f;
		this.lastName = l;
		this.age = age;
		// this.address = address; // Gán giá trị địa chỉ trong bộ nhớ
		this.address = new Address(address); // Tạo mới một không gian bộ nhớ để lưu giá trị
		/// Số đối tượng được tăng lên tại đây
		Person.count++;
	}

	// Getter methods
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

	// Setter methods
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

	// Other methods

	public String toString() {
		return this.lastName + " " + this.firstName + " " + age + " " + this.address.toString();
	}

	/*
	 * <b>Lấy về đối tượng được sinh ra trong một lớp </b> <br/> <i>Cập nhật ngày
	 * 11/04/2020</i>
	 *
	 * @return
	 */
	public static short getCountPerson() {
		return Person.count;
	}
	/*
	 *
	 * Dọn dẹp đối tượng khỏi bộ nhớ
	 *
	 */

	/*
	 * protected void finalize() throws Throwable { super.finalize(); // Giảm số đối
	 * tượng được tạo ra Person.count--; }
	 */

	public static void main(String[] agrs) {
		// Tạo đối tượng địa chỉ
		Address addr = new Address("Nam Định", "Nam Trực", "Hồng Quang");

		// Khởi tạo đối tượng
		Person p;
		Person p1 = new Person();
		Person p2 = new Person((byte) 20);
		Person p3 = new Person("Vuong", "Vu Duc", (byte) 23, addr);

		// Xuất thông tin đối tượng
		/*
		 * System.out.println(p1.toString()); System.out.println(p2);
		 * System.out.println(p3);
		 */

		// Xuất thông tin đối tượng
		System.out.println(p3);
		// Sửa cái địa chỉ ở trên sau khi đã tạo ra p3
		addr.setStreetName("Hau Phu");
		// In lại
		System.out.println(p3);
		/*
		 * //Bổ sung thông tin cho đối tượng
		 * p1.setFirstName("Tuấn").setLastName("Trần Quốc").setAge((byte)20); //Xuất
		 * thông tin đối tượng System.out.println("Sá»‘ Ä‘á»‘i tÆ°á»£ng táº¡o ra lÃ : "
		 * + Person.getCountPerson());
		 */
	}
}
