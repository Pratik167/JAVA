package bankingSystem;

public class CurrentAccount extends Account 
{
    @Override
    public double calculateInterest()
    {
        return getBalance()*0.03; // 3% interest
    }
}
