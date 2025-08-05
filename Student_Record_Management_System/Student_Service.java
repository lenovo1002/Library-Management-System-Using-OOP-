package Student_Record_Management_System;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Student_Service implements Student_Service_Methods {
	Scanner scn = new Scanner (System.in) ;
	List<Student> stdList = new ArrayList<>() ;
	
	public Student_Service () {
		stdList.add(new Student(1, "Liam Johnson", 85, 20, "Computer Science", "liam.johnson@example.com", 'A'));
		stdList.add(new Student(2, "Olivia Smith", 78, 21, "Physics", "olivia.smith@example.com", 'B'));
		stdList.add(new Student(3, "Noah Williams", 92, 19, "Mathematics", "noah.williams@example.com", 'A'));
		stdList.add(new Student(4, "Emma Brown", 65, 20, "Chemistry", "emma.brown@example.com", 'C'));
		stdList.add(new Student(5, "Oliver Jones", 75, 22, "Biology", "oliver.jones@example.com", 'B'));
		stdList.add(new Student(6, "Ava Garcia", 88, 21, "History", "ava.garcia@example.com", 'A'));
		stdList.add(new Student(7, "Elijah Miller", 59, 19, "English Literature", "elijah.miller@example.com", 'D'));
		stdList.add(new Student(8, "Sophia Davis", 81, 20, "Psychology", "sophia.davis@example.com", 'B'));
		stdList.add(new Student(9, "Mason Rodriguez", 70, 23, "Economics", "mason.rodriguez@example.com", 'C'));
		stdList.add(new Student(10, "Isabella Martinez", 95, 18, "Computer Science", "isabella.martinez@example.com", 'A'));
	}

	@Override
	public void saveStudent() {
		
		System.out.print("Enter an ID : ");
		long id = scn.nextLong() ;
		scn.nextLine() ;
		System.out.print("Enter Name : ");
		String name = scn.nextLine();
		System.out.print("Enter marks : ");
		double marks = scn.nextDouble() ;
		scn.nextLine() ;
		System.out.print("Enter age : ");
		int age = scn.nextInt() ;
		scn.nextLine() ;
		System.out.print("Enter course : ");
		String course = scn.nextLine() ;
		System.out.print("Enter Email : ");
		String email = scn.nextLine() ;
		System.out.print("Enter grade : ");
		char grade = scn.nextLine().charAt(0) ;
		stdList.add(new Student (id , name , marks , age ,  course , email , grade )) ;
		System.out.print("Student Data Saved ! ");
		


	}

	@Override
	public void viewStudent() {
		System.out.print("########## List of all Students : ##########\n");
		for (Student std : stdList) {
			System.out.println(std.toString());
		}
		
	}

	@Override
	public void updateStudent(long id ) {
		
		
		

		Student stdCurrent = stdList.stream()
	       .filter(std -> std.getId() == id)
	       .findFirst()
	       .orElse(null);
		
		if (stdCurrent == null) {return ;}
		
		System.out.print("Current Student data : \n");
		System.out.print(stdCurrent.toString());
		
		System.out.println("\nStill wanna update ? : (y/n)");
		char userValue = scn.nextLine().toLowerCase().charAt(0) ;
		switch (userValue) {
		case 'y' :
			System.out.print("Enter Name : ");
			String name = scn.nextLine();
			stdCurrent.setName(name) ;
			System.out.print("Enter marks : ");
			double marks = scn.nextDouble() ;
			scn.nextLine() ;
			stdCurrent.setMarks(marks) ;
			System.out.print("Enter age : ");
			int age = scn.nextInt() ;
			scn.nextLine() ;
			stdCurrent.setAge(age) ;
			System.out.print("Enter course : ");
			String course = scn.nextLine() ;
			stdCurrent.setCourse(course) ;
			System.out.print("Enter Email : ");
			String email = scn.nextLine() ;
			stdCurrent.setEmail(email) ;
			System.out.print("Enter grade : ");
			char grade = scn.nextLine().charAt(0) ;
			stdCurrent.setGrade(grade) ;
			
			System.out.println("data updated ! ");
			System.out.print(stdCurrent.toString());

			break ;
			
		case 'n':
			System.out.print("No changes ! ");
		}

	}

	@Override
	public void deleteStudent(long id ) {
	
		if (stdList.removeIf(checkId -> checkId.getId()==id)) {
		System.out.println("Student data deleted ! "); 
		return ;}
		
		System.out.println("Invalid ID ! ");
		
		
	}
	

}
