
public class Address {
	// Constans - 1
	public static final String CITYNAME = "No Name";
	public static final String DISTRICTNAME = "No Name";
	public static final String STREETNAME = "No Name";
	// Object's properties - 0
	public static short count = 0;

	private String cityName;
	private String districtName;
	private String streetName;
	
	
	
	// Constructor method -2
	public Address() {
		this(Address.CITYNAME, Address.DISTRICTNAME, Address.STREETNAME);
	}

	public Address(String cityName) {
		this(cityName, Address.DISTRICTNAME, Address.STREETNAME);
	}

	public Address(String cityName, String districtName, String streetName) {
		this.cityName = cityName;
		this.districtName = districtName;
		this.streetName = streetName;
		Address.count++;
	}
	public Address(Address addr) {
		//special 3
		this(addr.getCityName(), addr.getDistrictName(), addr.getStreetName());
	}
	// Getter methods -3
	public String getCityName() {
		return this.cityName;
	}
	
	public String getDistrictName() {
		return this.districtName;
	}

	public String getStreetName() {
		return this.streetName;
	}

	// Setter methods - 4
	public Address setCityName(String cityName) {
		this.cityName = cityName;
		return this;
	}

	public Address setDistrictName(String districtName) {
		this.districtName = districtName;
		return this;
	}

	public Address setStreetName(String streetName) {
		this.streetName = streetName;
		return this;
	}

	// Other methods - 5
	public String toString() {
		return this.cityName + "-" + this.districtName + "-" + this.streetName;
	}

	public static short getCountAddress() {
		return Address.count;
	}

	protected void finalize() throws Throwable {
		super.finalize();
		Address.count--;
	}

	public static void main(String[] args) {
		Address a1 = new Address();
		Address a2 = new Address("Cửa Lò");
		Address a3 = new Address("Cửa Lò", "Nghệ An", "Nguyễn Thức Tự");

		System.out.println("So doi tuong tao ra la: " + Address.getCountAddress());
		a1.setCityName("Cửa Lò").setDistrictName("Nghệ An").setStreetName("Nguyễn Thức Tự");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
}
