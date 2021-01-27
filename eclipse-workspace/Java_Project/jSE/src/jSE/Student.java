package jSE;

public class Student extends Person {
	// Student's constants
	public static final String ID = "(2020)0000111";
	public static final String SPECIALY = "NONE";

	// Student 's properties
	private String id;
	private String specialy;

	// Student's constructor methods
	public Student() {
		this(Student.FIRSTNAME, Student.LASTNAME, Student.AGE, Student.ADDRESS, Student.ID, Student.SPECIALY);
	}

	public Student(String firstName, String lastName, byte age, Address address, String id, String specialy) {

		// Khởi tạo Person(cha)
		super(firstName, lastName, age, address);

		// Gán giá trị cho các thuộc tính đối Student
		this.id = id;
		this.specialy = specialy;

	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the specialy
	 */
	public String getSpecialy() {
		return specialy;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param specialy the specialy to set
	 */
	public void setSpecialy(String specialy) {
		this.specialy = specialy;
	}

	@Override
	public String toString() {
		return "Student: " + super.toString() + " [id=" + id + ", specialy=" + specialy + "]";
	}

	public static void main(String[] agrs) {
		// Địa chỉ
		Address addr = new Address("Hà Nội", "Bắc Từ Liêm", " Phố Nhổn");

		// Tạo một sinh viên
		Person s = new Student("Tuấn", "Phạm Văn", (byte) 20, addr, "(2019)00123006", "Kỹ thuật phần mềm");

		// In thông tin
		System.out.println(s.toString());
	}
}
