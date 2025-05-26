package bankingSystem;


public class SavingAccount extends Account 
{
    @Override
    public double calculateInterest()
    {
        return getBalance()*0.04; //4% interest
    }
}
