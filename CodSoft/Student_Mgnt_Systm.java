// #CODSOFT
//Task No 4 (Student_Management_System)
import java.util.*;
import java.io.*;;
class Student_Mgnt_Systm extends Student
{
    int count;
    int MAX_STUDENTS;
    Student[] students = new Student[MAX_STUDENTS];
    Student_Mgnt_Systm(String snm, String house, int grade, int rolno, long mobil, int mxstu, int cnt)
    {
        super(snm, house, grade, rolno, mobil);
        count = cnt;
        MAX_STUDENTS = mxstu;
    }
    void totalStudents()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Total Number of students : ");
            MAX_STUDENTS = sc.nextInt();
            count = 0;
        }
    void addStudent(String name, String house, int grade, int rollNo, long contactNo)
    {
        if (count < MAX_STUDENTS) 
        {
            students[count] = new Student(name, house, grade, rollNo, contactNo);
            count++;
            displayMessage("Student added successfully.");
        } 
        else 
            displayMessage("Student list is full. Cannot add more students.");
    }
    void removeStudent(int rollNo)
    {
        for (int i = 0; i < count; i++) 
        {
            if (students[i].rollno == rollno) 
            {
                for (int j = i; j < count - 1; j++) 
                {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                displayMessage("Student removed successfully.");
                return;
            }
        }
        displayMessage("Student with roll number " + rollNo + " not found.");
    }
    void searchStudent(int rollNo)
    {
        for (int i = 0; i < count; i++) 
        {
            if (students[i].rollno == rollNo) 
            {
                students[i].print();
                return;
            }
        }
        displayMessage("Student with roll number " + rollNo + " not found.");
    }
     void displayAllStudents()
    {
        if (count == 0) 
            displayMessage("No students found.");
        else 
        {
            for (int i = 0; i < count; i++) {
                students[i].print();
                System.out.println("-------------------------------");
            }
        }
    }
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum number of students: ");
        int maxStudents = sc.nextInt();
        Student_Mgnt_Systm sms = new Student_Mgnt_Systm(MAX_STUDENTS);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    sc.nextLine(); // Consume newline
                    String name = sc.nextLine();
                    System.out.print("Enter House: ");
                    String house = sc.nextLine();
                    System.out.print("Enter Grade: ");
                    int grade = sc.nextInt();
                    System.out.print("Enter Roll Number: ");
                    int rollNo = sc.nextInt();
                    System.out.print("Enter Contact Number: ");
                    long contactNo = sc.nextLong();
                    sms.addStudent(name, house, grade, rollNo, contactNo);
                    break;

                case 2:
                    System.out.print("Enter Roll Number of the student to remove: ");
                    int removeRollNo = sc.nextInt();
                    sms.removeStudent(removeRollNo);
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int searchRollNo = sc.nextInt();
                    sms.searchStudent(searchRollNo);
                    break;

                case 4:
                    sms.displayAllStudents();
                    break;

                case 5:
                    exit = true;
                    sms.displayMessage("Exiting Student Management System...");
                    break;

                default:
                    sms.displayMessage("Invalid choice. Please try again.");
            }
        }
    }
}