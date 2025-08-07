package Library_Management_System;
import java.util.List ;
import java.util.ArrayList ;
import java.util.Scanner ;
public class Library {
	private Scanner scn = new Scanner (System.in) ;
	private static int uid = 1000;
	private static int bid = 10;
	private List<Book> aBooks = new ArrayList<Book>() ;
	private List<User> users = new ArrayList<User>() ;
	
	public Library () {
		
		aBooks.add(new Book(1001, "The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 10));
		aBooks.add(new Book(1002, "Dune", "Frank Herbert", 5));
		aBooks.add(new Book(1003, "To Kill a Mockingbird", "Harper Lee", 15));
		aBooks.add(new Book(1004, "1984", "George Orwell", 8));
		aBooks.add(new Book(1005, "Pride and Prejudice", "Jane Austen", 12));
		aBooks.add(new Book(1006, "The Lord of the Rings", "J.R.R. Tolkien", 7));
		aBooks.add(new Book(1007, "The Catcher in the Rye", "J.D. Salinger", 9));
		aBooks.add(new Book(1008, "Moby-Dick", "Herman Melville", 3));
		aBooks.add(new Book(1009, "War and Peace", "Leo Tolstoy", 2));
		aBooks.add(new Book(1010, "The Great Gatsby", "F. Scott Fitzgerald", 1));
		
		users.add(new User(101, "Alice Johnson"));
		users.add(new User(102, "Bob Williams"));
		users.add(new User(103, "Charlie Brown"));
		users.add(new User(104, "Diana Smith"));
		users.add(new User(105, "Edward Davis"));
		users.add(new User(106, "Fiona Miller"));
		users.add(new User(107, "George Wilson"));
		users.add(new User(108, "Hannah Moore"));
		users.add(new User(109, "Ian Taylor"));
		users.add(new User(110, "Julia White"));
	}
	
	public void addUser() {
		System.out.print("Enter User Name : ");
		String uName = scn.next() ;
		uid+=1;
		users.add(new User(uid , uName)) ;
		
		System.out.println("""
				User created successfully ! 
				Here is your credentials : 
				UserID : %s
				Username : %s
				
				""".formatted(uid , uName));
		
		
		
	}
	
	public void showUsers() {
		
		System.out.printf("%-15s %-15s\n" , "User ID" , "User Name");
		System.out.println("-----------------------------------------------------------------------------------------");
		for (User u : users) {
		System.out.printf("%-15s %-15s\n" , u.getName() , u.getUserID());
	}}
	
	public void addBook ( ) {
		bid+=1 ;
		System.out.print("Enter book title : ");
		String bTitle = scn.nextLine() ;
		System.out.print("Enter book author : ");
		String nAuthor = scn.nextLine() ;
		System.out.print("Enter book copies : ");
		int tCopies = scn.nextInt() ;
		
		aBooks.add(new Book (bid , bTitle , nAuthor , tCopies)) ;
		System.out.println( "Book Added with book ID "+bid);
		
	}
	
	public void showBooks () {
		System.out.printf("%-5s %-40s %-25s %-10s %-10s\n", "ID", "Title", "Author", "Copies", "Available");
		System.out.println("-----------------------------------------------------------------------------------------");

		for (Book b : aBooks) {
		    System.out.printf("%-5d %-40s %-25s %-10d %-10d\n",
		        b.getId(), b.getTitle(), b.getAuthor(), b.gettCopies(), b.getaCopies());
		}

	}
	
	
	public void issueBook(int bID , int uID) {
		Book b  = aBooks.stream().filter(book -> book.getId()==bID).findFirst().orElseThrow(() -> new IllegalArgumentException("Book ID not found -->" + bID)) ;
		User u  = users.stream().filter(user -> user.getUserID()==uID).findFirst().orElseThrow(() -> new IllegalArgumentException("User ID not found -->" + bID)) ;
		if (b.getaCopies()>0) {
			
			b.setaCopies(b.getaCopies()-1);
			System.out.println("\nfollowing book is issued : ");
			System.out.printf("%-10s %-50s %-10s\n" , "Book ID", "Book Name" , "Book Author");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.printf("%-10s %-50s %-10s\n",b.getId() ,b.getTitle(), b.getAuthor()); 
			
		u.setIssueBookes(b);
			
		}
		
		
	
		else {
			System.out.println("No more coppies availabe ! ");
		}
		
		
	}
	
	public void submitBook(int id , int uID) {
		Book b = aBooks.stream().filter(book -> book.getId()==id).findFirst().orElseThrow(()-> new IllegalArgumentException("Invalid Book "+id)) ;
		User u = users.stream().filter(user -> user.getUserID()==uID).findFirst().orElseThrow(() -> new IllegalArgumentException("User not found" + uID)) ;
		if (b.getaCopies()+1<=b.gettCopies()) {
		b.setaCopies(b.getaCopies()+1);
		u.submitBook(id);
		System.out.println("Book Submitted ! "); }
		else {
			System.out.println("\"Return failed: All copies are already in the library.\"\r\n"
					+ "");
		}
		
	}
	
	public void userDetails(int uID) {
		User u = users.stream().filter(user -> user.getUserID()==uID).findFirst().orElseThrow(()-> new IllegalArgumentException("User not found ! ")) ;
		u.userDetails();
	
	}
	

}
