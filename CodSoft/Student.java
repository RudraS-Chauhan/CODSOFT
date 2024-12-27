import java.util.*;
class Student 
{
    String stname;
    String hse;
    int rollno;
    int clas;
    long mobno;
    void displayMessage(String message)
    {
        System.out.println(message);
    }
    Student(String snm, String house, int grade, int rolno, long mobil)
    {
        this.stname = snm;
        this.clas = grade;
        this.hse = house;
        this.rollno = rolno;
        this.mobno = mobil;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        stname = sc.nextLine();
        System.out.println("Enter your roll number : ");
        rollno = sc.nextInt();
        System.out.println("Enter your grade : ");
        clas = sc.nextInt();
        System.out.println("Enter house you are in : ");
        hse = sc.next();
        System.out.println("Enter your contact number : ");
        mobno = sc.nextLong();
    }
    void print()
    {
        System.out.println("Name : " + stname);
        System.out.println("Roll number : " + rollno);
        System.out.println("Grade : " + clas);
        System.out.println("House : " + hse);
        System.out.println("Contact Info : " + mobno);
    }
}