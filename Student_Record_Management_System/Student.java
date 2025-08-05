package Student_Record_Management_System;


public class Student {
	private long id ; 
	private String name ;
	private double marks ;
	private int age ;
	private String course ;
	private String email ;
	private char grade ;
	
	

	

	public Student(long id, String name, double marks, int age, String course, String email, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;
		this.course = course;
		this.email = email;
		this.grade = grade;
	}




	@Override
	public String toString() {
		return "Student "+ id+ " [id=" + id + ", name = " + name + ", marks = " + marks + ", age = " + age + ", course = " + course
				+ ", email = " + email + ", grade = " + grade + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}

}
