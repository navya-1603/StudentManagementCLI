package StudentManagementCLI;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
     ArrayList<Student> studentList = new ArrayList<>();
     Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main main=new Main();
        main.run();
    }

    public void run() {
            int choice;

            do {
                System.out.println("\n--- Student Management CLI ---");
                System.out.println("1. Add Student");
                System.out.println("2. Display All Students");
                System.out.println("3. Search Student by ID");
                System.out.println("4. Delete Student by ID");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        displayStudents();
                        break;
                    case 3:
                        searchStudent();
                        break;
                    case 4:
                        deleteStudent();
                        break;
                    case 5:
                        System.out.println("Exiting program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } while (choice != 5);
        } 
        

    private void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        Student student = new Student(id, name);
        studentList.add(student);
        System.out.println("Student added successfully.");
    }

    private void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("\nList of Students:");
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }

    private void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();
        boolean found = false;

        for (Student s : studentList) {
            if (s.getId() == id) {
                System.out.println("Student Found: " + s);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    private void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        boolean removed = false;

        for (Student s : studentList) {
            if (s.getId() == id) {
                studentList.remove(s);
                System.out.println("Student deleted successfully.");
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Student not found.");
        }
    }
}
