package jSE;

public class Employee extends Person {
	public static final int NET = 11;
	public static final String POSITION = "NONE";

	// Employee's properties
	private int net;
	private String position;

	// Employee's constructor methods
	public Employee() {
		this(Employee.FIRSTNAME, Employee.LASTNAME, Employee.AGE, Employee.ADDRESS, Employee.NET, Employee.POSITION);
	}

	public Employee(String firstName, String lastName, byte age, Address address, int net, String position) {

		// Khởi tạo Person(cha)
		super(firstName, lastName, age, address);

		// Gán giá trị cho các thuộc tính đối Employee
		this.net = net;
		this.position = position;

	}

	/**
	 * @return the net
	 */
	public int getNet() {
		return net;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param net the net to set
	 */
	public void setNet(int net) {
		this.net = net;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employee: " + super.toString() + " [net=" + net + ", position=" + position + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Tạo địa chỉ
		Address addr = new Address("Hà d Nội", "Bắc Từ Liêm", " Phố Nhổn");

		// Tạo một nhân viên
		Person e = new Employee("Vượng", "Vũ Đức", (byte) 25, addr, (int) 15000000, "Kỹ sư phần mềm");

		// In thông tin
		System.out.println(e.toString());
	}
}
