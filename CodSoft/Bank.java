// #CODSOFT
//Task No 3 (ATM Interface)
import java.util.*;
class Bank
{
    double balance;
    Bank(double intialBalance)
    {
        balance = intialBalance;
    }
    void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } 
        else 
            System.out.println("Deposit amount must be positive.");
    } 
    double getBalance() 
    {
        return balance;
    }
    void withdraw(double amount) 
    {
        if (amount > balance) 
        {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } 
        else if (amount > 0) 
        {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } 
        else
            System.out.println("Withdrawal amount must be positive.");
    }
}