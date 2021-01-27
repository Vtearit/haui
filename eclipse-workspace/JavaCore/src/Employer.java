
public class Employer extends Person {
	//Employer's constants 
	public static final int NET = 0;
	public static final String POSITION = "NONE";
	
	//Employer's constant
	private int net;
	private String position;
	public Employer() {
		this(Employer.FIRSTNAME,Employer.LASTNAME,Employer.AGE,Employer.ADDRESS,Employer.NET,Employer.POSITION);
	}
	
	public Employer(String firstName, String lastName, byte age, Address address, int net, String position) {
		super(firstName,lastName,age,address);
		this.net = net;
		this.position = position;
	}

	public int getNet() {
		return net;
	}

	public String getPosition() {
		return position;
	}

	public void setNet(int net) {
		this.net = net;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Employer:"+super.toString()+" [net=" + net + ", position=" + position + "]";
	}
	public static void main(String[] args) {
		Address addr = new Address("HaNoi","BacTuLiem","PhoNhon");
		
		//Employer e = new Employer("Thien","Nguyen Thanh", (byte)20, addr,1000,"Fresher");
		Person e = new Employer("Thien","Nguyen Thanh", (byte)20, addr,1000,"Fresher");
		System.out.print(e.toString());
	}
}
