package jSE;

public class TestManager {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Địa chỉ
		Address addr = new Address("Hà Nội", "Bắc Từ Liêm", " Phố Nhổn");

		//
		Person s = new Student("Tuấn", "Phạm Văn", (byte) 20, addr, "(2019)00123006", "Kỹ thuật phần mềm");
		Person e = new Employee("Vượng", "Vũ Đức", (byte) 25, addr, (int) 15000000, "Kỹ sư phần mềm");

		// ----------------------------------------
		Manager sm = new StudentManager();
		Manager em = new EmployeeManager();

		// Xuất thông tin
		System.out.println(sm.getInfo(s));
		System.out.println(em.getInfo(e));
	}
}
