package Library_Management_System;
import java.util.Scanner;

public class ConsoleUI {
	public static void UI() {
		Library l1 = new Library() ;
		Scanner scn = new Scanner (System.in) ;
		while (true) {
		
		System.out.print("""
				
					------------------------------------------------------------------------------------------------------
										Library Management System
					------------------------------------------------------------------------------------------------------
					Please Choose an option :
					
					1.  Add a New Book
					2.  Add a New User
					3.  Display All Books
					4.  Display All Users
					5.  Issue a Book to User
					6.  Return a Book from User
					7.  Get user details
					8.  Exit
					
					Enter your Choice :  """);
		String choice = scn.next() ;
		
		if (choice.matches("^[1-8]$")) { 
		
		switch (choice) {
		case "1" -> {l1.addBook(); System.out.println(); }
		case "2" -> {l1.addUser(); System.out.println();}
		case "3" -> {l1.showBooks(); System.out.println();}
		case "4" -> {l1.showUsers(); System.out.println();}
		case "5" -> {
				System.out.print("Enter book ID :");
				int bID = scn.nextInt() ;
				System.out.print("Enter uID :");
				int uID = scn.nextInt() ;
			l1.issueBook(bID, uID);
			System.out.println();
		}
		
		
		case "6" -> {
			System.out.print("Enter book ID :");
			int bID = scn.nextInt() ;
			System.out.print("Enter uID :");
			int uID = scn.nextInt() ;
			l1.submitBook(bID, uID);
			System.out.println();
		}
		
		case "7" -> {
			System.out.print("Enter user ID : ");
			l1.userDetails(scn.nextInt());
			System.out.println();
		}
		
		case "8"  -> {
			System.out.print("Thank you  ! ");
			System.exit(0);}
		} }
		
		else {
			System.out.println("Enter valid input ! ");
			System.out.println();
		}
		
		scn.close(); 
		
	}}
	

}
