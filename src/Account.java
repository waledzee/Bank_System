 import java.util.ArrayList;
public class Account
{
    private int accountID;
   private float balance;
    private Customer customer;

    //constractor
    public Account(int accountID,float balance ,Customer customer)
    {
        this.accountID=accountID;
        this.balance=balance;
        this.customer= customer;
    }

    public void depoiste(float amount)
    {
        if(amount >0) {
            this.balance += target;
            System.out.println("amount is added sucessfully");
        }
        else
        {
            System.out.println("amunt must be positive");
        }

    }
    public void withdraw(float amount)
    {
        // if condition
        this.balance -= target;
    }
    public float checkBalance()
    {
        return balance;
    }
    public void displayAccountInfo() {
        System.out.println("Account ID: " + accountID);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Balance: " + balance);
    }


}
