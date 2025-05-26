package bankingSystem;
import java.util.Scanner;

public abstract class Account 
{
    private double balance;
    private static Scanner sc = new Scanner(System.in);

    public void setInitialBalance() 
    {
        System.out.print("Enter initial balance: ");
        balance = sc.nextDouble();
    }

    public void withdraw() 
    {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } 
        else 
        {
            System.out.println("Insufficient balance!");
        }
    }

    public double getBalance() 
    {
        return balance;
    }

    public abstract double calculateInterest();
}
