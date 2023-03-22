package dto;

public class Book {
	private int book_id;
	private String name;
	private String human;
	private String publisher;
	private String date;
	private int isbn;
	private String version;
	
	public Book(int book_id, String name, String human, String publisher, String date, int isbn, String version) {
		super();
		this.book_id = book_id;
		this.name = name;
		this.human = human;
		this.publisher = publisher;
		this.date = date;
		this.isbn = isbn;
		this.version = version;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHuman() {
		return human;
	}

	public void setHuman(String human) {
		this.human = human;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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
	
	
}
