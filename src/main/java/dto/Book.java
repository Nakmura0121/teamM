package dto;

public class Book {
	private int book_id;
	private String book_name;
	private String author;
	private String publisher;
	private int isbn;
	private String version;
	private String date;
	
	public Book(int book_id, String book_name, String author, String publisher, int isbn, String version, String date) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
		this.version = version;
		this.date = date;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}