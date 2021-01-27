package jSE;

public class Book {
	// Constants - 1
	public static final String BOOK_URL_DOWNLOAD = "Can't download";

	// Object's properties - 0
	private short book_id;
	private String book_title;
	private String book_publisher;
	private short book_number_pages;
	private String book_summary;
	private String book_url_download;
	private String book_tags;
	private Person book_author;

	// Constructor methods - 2
	public Book(short book_id, String book_title, String book_publishser, short book_number_pages, String book_sumary,
			String book_url_download, String book_tags, Person book_author) {
		this.book_id = book_id;
		this.book_title = book_title;
		this.book_publisher = book_publishser;
		this.book_number_pages = book_number_pages;
		this.book_summary = book_sumary;
		this.book_url_download = book_url_download;
		this.book_tags = book_tags;
		this.book_author = book_author;
	}

	public Book(short book_id, String book_title, String book_publishser, short book_number_pages, String book_sumary,
			String book_tags, Person book_author) {
		this(book_id, book_title, book_publishser, book_number_pages, book_sumary, Book.BOOK_URL_DOWNLOAD, book_tags,
				book_author);
	}

	// Getter methods - 3
	public short getBook_id() {
		return book_id;
	}

	public String getBook_title() {
		return book_title;
	}

	public String getBook_publisher() {
		return book_publisher;
	}

	public short getBook_number_pages() {
		return book_number_pages;
	}

	public String getBook_summary() {
		return book_summary;
	}

	public String getBook_url_download() {
		return book_url_download;
	}

	public String getBook_tags() {
		return book_tags;
	}

	public Person getBook_author() {
		return book_author;
	}

	// Setter methods - 4
	public Book setBook_id(short book_id) {
		this.book_id = book_id;
		return this;
	}

	public Book setBook_title(String book_title) {
		this.book_title = book_title;
		return this;
	}

	public Book setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
		return this;
	}

	public Book setBook_number_pages(short book_number_pages) {
		this.book_number_pages = book_number_pages;
		return this;
	}

	public Book setBook_summary(String book_summary) {
		this.book_summary = book_summary;
		return this;
	}

	public Book setBook_url_download(String book_url_download) {
		this.book_url_download = book_url_download;
		return this;
	}

	public Book setBook_tags(String book_tags) {
		this.book_tags = book_tags;
		return this;
	}

	public Person setBook_author(Person book_author) {
		return this.book_author;
	}

	// Other methods - 5
	public String toString() {
		return this.book_id + "  " + this.book_title + "\t" + this.book_publisher + "\t" + this.book_number_pages + "\t"
				+ this.book_summary + "\t" + this.book_url_download + "\t" + this.book_tags + "\t" + this.book_author;
	}

	protected void finalize() throws Throwable {
		super.finalize();
	}

	public static void main(String[] args) {
		// Khởi tạo đối tượng
//			Book b1 = new Book((short) 1, "7 thói quen của bạn trẻ thành đạt", "NXB Trẻ\t", (short) 311, "Notebook",
//					"sachvui.com", "Tâm Lý - Kỹ Năng Sống", "Alex");
//			Book b2 = new Book((short) 2, "Tài ăn nói của người đàn ông", "\tNXB Dân Trí", (short) 268, "Notebook",
//					"Tâm Lý - Kỹ Năng Sống");

		// Xuất thông tin đối tượng
//			System.out.println(b1);
//			System.out.println(b2);
	}
}
