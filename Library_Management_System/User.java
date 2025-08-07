package Library_Management_System;

import java.util.ArrayList;
import java.util.List ;
public class User  {
	
	
	public User(int userID, String name) {
		super();
		this.userID = userID;
		this.name = name;
		this.issueBookes = new ArrayList<Book>() ;
		
	}
	private int userID ;
	private String name;
	private List<Book> issueBookes;
	
	
	public User() {
	}
	
	
	
	
	public void userDetails() {
		
		StringBuilder bookDetails = new StringBuilder()  ;
		for (Book b : issueBookes) {
			 bookDetails.append(b.getTitle() +"\t" + b.getId() +", ") ;
			
		}
		System.out.println("\nUser Details : ");
		System.out.println("------------------------------------------------------------------------");
		System.out.printf("%-10s %-20s %-20s\n" ,"user ID" , "user name" , "issue book\n");
		System.out.println("-------------------------------------------------------------------------");
		System.out.printf("%-10s %-20s %-20s" , userID , name , "["+ bookDetails +"]");
		
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public java.util.List<Book> getIssueBookes() {
		return issueBookes;
	}
	public void setIssueBookes(Book b) {
		
		this.issueBookes.add(b);
	}
	
	public void submitBook(int bID) {
		issueBookes.removeIf(book -> book.getId() == bID) ;
		
	}

}
