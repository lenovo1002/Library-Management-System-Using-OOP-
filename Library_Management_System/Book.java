package Library_Management_System;

public class Book  { 
	private int id , tCopies , aCopies  ;
	
	
	
	public Book(int id, String title, String author ,  int tCopies) {
		super();
		this.id = id;
		this.tCopies = tCopies;
		this.title = title;
		this.author = author;
		this.aCopies = tCopies ;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", tCopies=" + tCopies + ", aCopies=" + aCopies + ", title=" + title + ", author="
				+ author + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int gettCopies() {
		return tCopies;
	}
	public void settCopies(int tCopies) {
		this.tCopies = tCopies;
	}
	public int getaCopies() {
		return aCopies;
	}
	public void setaCopies(int aCopies) {
		this.aCopies = aCopies;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	private String title  , author   ; 
	
	
}
