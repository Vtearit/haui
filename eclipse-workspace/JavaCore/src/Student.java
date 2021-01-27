
public class Student extends Person {
	//Student's constants 
	public static final String ID = "(2020)000111";
	public static final String SPECIALY = "NONE";
	
	//Student's properties
	private String id;
	private String specialy;
	
	
	//Student's constructor method
	public Student() {
		this(Student.FIRSTNAME, Student.LASTNAME, Student.AGE, Student.ADDRESS,Student.ID,Student.SPECIALY);
	}
	
	public Student(String firstName, String lastName, byte age, Address address, String id, String specialy) {
		//Khoi tao Person (cha)
		super(firstName, lastName, age, address);
		
		// gan thuoc tinh cho cac doi tuong con
		this.id = id;
		this.specialy = specialy;
	}

	public String getId() {
		return id;
	}

	public String getSpecialy() {
		return specialy;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSpecialy(String specialy) {
		this.specialy = specialy;
	}

	@Override
	public String toString() {
		return "Student: "+ super.toString() + " [id=" + id + ", specialy=" + specialy + "]";
	}
	 public static void main(String[] args) {
		 //Dia chi
		 Address addr = new Address("HaNoi","BacTuLiem","PhoNhon");
		 
		 //Tao 1 sinh vien
		 //Student s = new Student("Thien","Nguyen Thanh", (byte)20, addr, "(2019)00123006","Ky thuat phan mem");
		 Person s = new Student("Thien","Nguyen Thanh", (byte)20, addr, "(2019)00123006","Ky thuat phan mem");
		 
		 System.out.println(s.toString());
	 }
}
