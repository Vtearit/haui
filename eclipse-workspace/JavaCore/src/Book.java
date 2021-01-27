
public class Book {
	// Constans - 1
	public static final short BOOK_ID = 0;
	public static final String BOOK_TITLE = "NoTitle";
	public static final String BOOK_PUBLISHER = "NoTitle";
	public static final short BOOK_NUMBER_PAGES = 0;
	public static final String BOOK_SUMMARY = "NoTitle";
	public static final String BOOK_URL_DOWNLOAD = "NoTitle";
	public static final String BOOK_TAGS = "NoTitle";
	public static final Person PERSON = new Person();
	// Classes' variable - 0
	public static short count = 0;

	private short book_id;
	private String book_title;
	private String book_publisher;
	private short book_number_pages;
	private String book_summary;
	private String book_url_download;
	private String book_tags;
	private Person book_author;
	//Constructor methos -2
	public Book() {
		this(Book.BOOK_ID,Book.BOOK_TITLE,Book.BOOK_PUBLISHER,Book.BOOK_NUMBER_PAGES,Book.BOOK_SUMMARY,Book.BOOK_URL_DOWNLOAD,Book.BOOK_TAGS,Book.PERSON);
	}
	public Book(short book_id) {
		this(book_id,Book.BOOK_TITLE,Book.BOOK_PUBLISHER,Book.BOOK_NUMBER_PAGES,Book.BOOK_SUMMARY,Book.BOOK_URL_DOWNLOAD,Book.BOOK_TAGS,Book.PERSON);
	}
	public Book(short book_id,String book_title,String book_publisher,short book_number_pages,String book_summary,String book_url_download,String book_tags, Person book_author) {
		this.book_id = book_id;
		this.book_publisher = book_publisher;
		this.book_number_pages = book_number_pages;
		this.book_summary = book_summary;
		this.book_url_download = book_url_download;
		this.book_tags = book_tags;
		this.book_author = new Person(book_author);
		Book.count++;
	}
	
	// Getter methods - 3
	public short getBookId() {
		return this.book_id;
	}
	public String getBookTitle() {
		return this.book_title;
	}
	public String getBookPublisher() {
		return this.book_publisher;
	}
	public short getBookNumberPages() {
		return this.book_number_pages;
	}
	public String getBookSummary() {
		return this.book_summary;
	}
	public String getBookUrlDownload() {
		return this.book_url_download;
	}
	public String getBookTags() {
		return this.book_tags;
	}
	public Person getBookAuthor() {
		return this.book_author;
	}
	public String getStringBookAuthor() {
		return this.book_author.toString();
	}
	// Setter methods - 4
	public Book setBookId(short book_id) {
		this.book_id = book_id;
		return this;
	}
	public Book setBookTitle(String book_title) {
		this.book_title = book_title;
		return this;
	}
	public Book setBookPublisher(String book_publisher) {
		this.book_publisher = book_publisher;
		return this;
	}
	public Book setBookNumberPages(short book_number_pages) {
		this.book_number_pages = book_number_pages;
		return this;
	}
	public Book setBookSummary(String book_summary) {
		this.book_summary = book_summary;
		return this;
	}
	public Book setBookUrlDownload(String book_url_download) {
		this.book_url_download = book_url_download;
		return this;
	}public Book setBookTags(String book_tags) {
		this.book_tags = book_tags;
		return this;
	}
	public Book setBookAuthor(Person book_author) {
		this.book_author = book_author;
		return this;
	}
	public Book setBookAuthor(String firstName, String lastName, byte age, Address address) {
		this.book_author = new Person(firstName,lastName,age,address);
		return this;
	}
	//Other methods - 5
	public String toString() {
		return this.book_id+"-"+this.book_title+"-"+this.book_publisher+"-"+this.book_number_pages+"-"+this.book_summary+"-"+this.book_url_download+"-"+this.book_tags+"-"+this.book_author;
	}
	public static short getCountBook() {
		return Book.count;
	}
	protected void finalize() throws Throwable{
		super.finalize();
		Book.count--;
	}
	public static void main(String[] args) {
		//tao person
		Person per = new Person("Thien","Nguyen Thanh",(byte)20, new Address("NA","CL","NTT"));
		
		Book b1 = new Book();
		Book b2 = new Book((short)1);
		Book b3 = new Book((short)2,"title","publisher",(short)100,"summary","urldownload","tags",per);
		System.out.println("So doi tuong tao ra la: " + Book.getCountBook());
		b1.setBookId((short)0).setBookTitle("HarryPotter").setBookPublisher("Bloomsbury");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
