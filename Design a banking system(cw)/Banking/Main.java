//import bankingSystem.*;
import bankingSystem.Account;
import bankingSystem.SavingAccount;
import bankingSystem.CurrentAccount;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Saving Account");
        SavingAccount saving = new SavingAccount();
        saving.setInitialBalance();
        saving.withdraw();
        System.out.println("Balance:" + saving.getBalance());
        System.out.println("Interest (4%):" + saving.calculateInterest());

        System.out.println("\n\n Current Account");
        CurrentAccount current = new CurrentAccount();
        current.setInitialBalance();
        current.withdraw();
        System.out.println("Balance:" + current.getBalance());
        System.out.println("Interest (3%):" + current.calculateInterest());
    }
}
