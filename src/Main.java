//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Customer customer1 = new Customer("001","khaled",new String[]{"john@example.com", "123-456-7890"});


        Account account1 = new Account(444,1500,customer1);
        Account account2 = new Account(555,1600,customer1);

        customer1.addAccount(account1);
        customer1.addAccount(account2);

        account1.depoiste(500.0f);

        // Withdraw from the second account
        account2.withdraw(2000.0f);

        // Check updated balances
        System.out.println(customer1.displayCustomerInfo());
    }
}