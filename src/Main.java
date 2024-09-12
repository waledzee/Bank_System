//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
         Customer customer =new Customer("001","khaled",{"john@example.com", "123-456-7890"});

         Account account1 = new Account(444,1500,customer);
        Account account2 = new Account(555,1600,customer);

        customer1.addaccount(account1);
        customer1.addaccount(account2);

        account1.deposit(500.0f);

        // Withdraw from the second account
        account2.withdraw(2000.0f);

        // Check updated balances
        customer1.displayCustomerInfo();
    }
}