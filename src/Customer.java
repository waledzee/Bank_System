import java.util.ArrayList;

public class Customer {

    public String name;
 public String customerId;
 public String[] contactInfo ;
 ArrayList<Account> accounts;

public Customer(String customerId,String name, String[] contactInfo)
 {
     this.customerId=customerId;
     this.name=name;
     this.contactInfo=contactInfo;

     this.accounts = new ArrayList<>();
 }
 public String getName() {
        return name;
}

    public  String displayCustomerInfo()
    {
        return "Customer Info : name "+name+ " Customer Id is : "+customerId;
    }

    public void addAccount(Account account) {
        accounts.add(account);  // Add account to the list
        System.out.println("Account added for customer: " + name);
    }

}
