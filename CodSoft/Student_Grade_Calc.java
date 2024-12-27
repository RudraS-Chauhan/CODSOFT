// #CODSOFT
// Task 2 (Student Grade Calculator)
import java.util.*;
class Student_Grade_Calc
{
    double marks_total;
    double avg_per;
    double eng,phy,chem,mat,comp,his,geo,ped;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of the following subject out of 100 obtained : ");
        System.out.println("English: ");
        eng = sc.nextDouble();
        if (eng < 0 || eng > 100) {
            System.out.println("Invalid input for English. Marks must be between 0 and 100. Exiting...");
            System.exit(0);
        }
        System.out.println("Physics: ");
        phy = sc.nextDouble();
        if (phy < 0 || phy > 100) {
            System.out.println("Invalid input for Physics. Marks must be between 0 and 100. Exiting...");
            System.exit(0);
        }
        System.out.println("Chemistry: ");
        chem = sc.nextDouble();
        if (chem < 0 || chem > 100) {
            System.out.println("Invalid input for Chemistry. Marks must be between 0 and 100. Exiting...");
            System.exit(0);
        }
        System.out.println("Maths: ");
        mat = sc.nextDouble();
        if (mat < 0 || mat > 100) {
            System.out.println("Invalid input for Maths. Marks must be between 0 and 100. Exiting...");
            System.exit(0);
        }
        System.out.println("Computer Science: ");
        comp = sc.nextDouble();
        if (comp < 0 || comp > 100) {
            System.out.println("Invalid input for Computer Science. Marks must be between 0 and 100. Exiting...");
            System.exit(0);
        }
        System.out.println("History: ");
        his = sc.nextDouble();
        if (his < 0 || his > 100) {
            System.out.println("Invalid input for History. Marks must be between 0 and 100. Exiting...");
            System.exit(0);
        }
        System.out.println("Geography: ");
        geo = sc.nextDouble();
        if (geo < 0 || geo > 100) {
            System.out.println("Invalid input for Geography. Marks must be between 0 and 100. Exiting...");
            System.exit(0);
        }
        System.out.println("Physical Education: ");
        ped = sc.nextDouble();
        if (ped < 0 || ped > 100) {
            System.out.println("Invalid input for Physical Education. Marks must be between 0 and 100. Exiting...");
            System.exit(0);
        }
    }
    void calculate()
    {
        marks_total = eng+phy+chem+mat+comp+his+geo+ped;

        avg_per = marks_total/8;
    }
    void show()
    {
            System.out.println("--- Results ---");
            System.out.println("Total Marks obtained by student : " + marks_total);
            System.out.println("Percentage obtained : " + avg_per);
        
            if(avg_per>=90)
            System.out.println("Grade A awarded");
            else if(avg_per<90 && avg_per>=80)
            System.out.println("Grade B awarded");
            else if(avg_per<80 && avg_per>=70)
            System.out.println("Grade C awarded");
            else if(avg_per<70 && avg_per>=60)
            System.out.println("Grade D awarded");
            else
            System.out.println("Grade E");
    }
    static void main()
    {
        Student_Grade_Calc Cal = new Student_Grade_Calc();
        Cal.input();
        Cal.calculate();
        Cal.show();
    }
}
