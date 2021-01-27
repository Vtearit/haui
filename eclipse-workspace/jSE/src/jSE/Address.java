package jSE;

public class Address {
	// Constants - 1
	public static final String CITYNAME = "No CityName";
	public static final String DISTRICTNAME = "No DistrictName";
	public static final String STREETNAME = "No StreetName";

	// Object's properties - 0
	private String cityName;
	private String districtName;
	private String streetName;

	// Constructor methods -2
	public Address() {
		this(Address.CITYNAME, Address.DISTRICTNAME, Address.STREETNAME);
	}

	public Address(String cityName, String districtName, String streetName) {
		this.cityName = cityName;
		this.districtName = districtName;
		this.streetName = streetName;
	}

	public Address(Address addr) {
		// Đặc biệt loại 3
		this(addr.getCityName(), addr.getDistrictName(), addr.getStreetName());
	}

	public Address(String streetName) {
		this(Address.CITYNAME, Address.DISTRICTNAME, streetName);
	}

	public Address(String districtName, String streetName) {
		this(Address.CITYNAME, districtName, streetName);
	}

	// Getter methods - 3
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
		return this.streetName + " " + this.districtName + " " + this.cityName;
	}

	protected void finalize() throws Throwable {
		super.finalize();
	}

	public static void main(String[] args) {
		// Khởi tạo đối tượng
		Address a1 = new Address();
		Address a2 = new Address("Xuân Phương");
		Address a3 = new Address("Xuân Phương", "Nam Từ Liêm", "Hà Nội");

		// bo sung thong tin cho doi tuong
		a1.setStreetName("Xuân Phương").setDistrictName("Nam Từ Liêm").setCityName("Hà Nội");

		// Xuất thông tin đối tượng
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
}
