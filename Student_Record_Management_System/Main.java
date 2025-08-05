package Student_Record_Management_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_Service ss = new Student_Service();

        while (true) {
            System.out.println("\n=========== Student Record Management System ===========");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ss.saveStudent();
                    break;
                case 2:
                    ss.viewStudent();
                    break;
                case 3:
                    System.out.print("Enter student ID to update: ");
                    long updateId = sc.nextLong();
                    ss.updateStudent(updateId);
                    break;
                case 4:
                    System.out.print("Enter student ID to delete: ");
                    long deleteId = sc.nextLong();
                    ss.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    System.exit(0);
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
