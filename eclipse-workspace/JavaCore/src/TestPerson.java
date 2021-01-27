
public class TestPerson {
	public static void main(String[] args) {
		Address addr = new Address("HaNoi","BacTuLiem","PhoNhon");

		 Person s = new Student("Thien","Nguyen Thanh", (byte)20, addr, "(2019)00123006","Ky thuat phan mem");
		 
		 Person e = new Employer("Thien","Nguyen Thanh", (byte)20, addr,1000,"Fresher");
		 
		 System.out.println(s.toString());
		 		
		 System.out.print(e.toString());
	}
}

