package j2se;
/*

*/

public class Person {

	//Constants
	public static final String FIRSTNAME = "No FirstName";
	public static final String LASTNAME = "No LastName";
	public static final byte AGE = 0;


	//Class's variables
	private static short count = 0;


	//Object's properties
	String firstName;
	String lastName;
	byte age;

	//Constructor methods
	public Person(){
		//Đặc biệt loại 1
	//	this.firstName = "No FirstName";
	//	this.lastName = "No LastName";
	//	this.age = 0;

	//	this("No FirstName", "No LastName", (byte)0);
		this(Person.FIRSTNAME, Person.LASTNAME, Person.AGE);
	}

	public Person(byte age){
		//Bình thường
	//	this.firstName = "No FirstName";
	//	this.lastName = "No LastName";
	//	this.age = age;

		this("No FirstName", "No LastName", age);
	}

	public Person(String f, String l, byte age){
		//Đặc biệt loại 2
		this.firstName = f;
		this.lastName = l;
		this.age = age;

		//Số đối tượng được tăng lên tại đây
		Person.count++;
	}

		//Getter methods
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public byte getAge(){
		return this.age;
	}

	//Setter methods
	public Person setFirstName(String firstName){
		this.firstName = firstName;
		return this;
	}
	public Person setLastName(String lastName){
		this.lastName = lastName;
		return this;
	}
	public Person setAge(byte age){
		this.age = age;
		return this;
	}

	//Other methods

	public String toString(){
		return this.lastName + " " + this.firstName + " " + age;
	}
	/*
	* <b>Lấy về đối tượng được sinh ra trong một lớp </b>
	* <br/>
	* <i>Cập nhật ngày 11/04/2020</i>
	*
	* @return
	*/
	public static short getCountPerson(){
		return Person.count;
	}
	/*
	*
	*Dọn dẹp đối tượng khỏi bộ nhớ
	*
	*/
	
	protected void finalize() throws Throwable{
		super.finalize();
		//Giảm số đối tượng được tạo ra
		Person.count--;
	}

	public static void public static void main(String[] args) {
		//Khởi tạo đối tượng
		Person p;
		Person p1 = new Person();
		Person p2 = new Person((byte)20);
		Person p3 = new Person("Vuong", "Vu Duc", (byte)23);

		// Xuất thông tin đối tượng
		System.out.println(p1.toString());
		System.out.println(p2);
		System.out.println(p3);

		//Xuất thông tin đối tượng
		System.out.println(p1);

		//Bổ sung thông tin cho đối tượng
		p1.setFirstName("Tuấn").setLastName("Trần Quốc").setAge((byte)20);

		System.out.println(p1);

		//Xuất thông tin đối tượng
		System.out.println("Số đối tượng tạo ra là: " + Person.getCountPerson());
}
