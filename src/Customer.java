public class Customer {
 public String name;
 public String customerId;
 public String[] contactInfo ;
 private float balance;

public Customer(String customerId,String name, String[] contactInfo,float balance)
 {
     this.customerId=customerId;
     this.name=name;
     this.contactInfo=contactInfo;
     this.balance=balance;
 }
 public String getName() {
        return name;
}

    public  String displayCustomerInfo()
    {
        return "Customer Info : name "+name+ " Customer Id is : "+customerId+" customer balance is " +balance;
    }

}
