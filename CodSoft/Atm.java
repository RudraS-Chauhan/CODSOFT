// #CODSOFT
//Task No 3 (ATM Interface)
import java.util.*;
class Atm extends Bank
{
    Scanner sc = new Scanner(System.in);
    Atm(double initialbalance)
    {
        super(initialbalance);
    }
    void displayMenu() 
    {
        System.out.println("\n--- ATM Menu ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }
    void transaction()
    {
        int option = 0;
        while(option!=4)
        {
            displayMenu();
            System.out.println("Select your desired function : ");
            option = sc.nextInt();
            switch (option) 
            {
                case 1:
                    System.out.println("Current Balance: ₹" + getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the ATM!");
        System.out.print("Enter your initial balance: ₹");
        double initialBalance = sc.nextDouble();
        Atm atm = new Atm(initialBalance);
        atm.transaction();
    }
}