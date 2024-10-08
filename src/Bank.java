 import java.util.ArrayList;
public class Bank {
    private ArrayList<Customer> customers;;

    public Bank()
    {
        customers = new ArrayList<>();
    }
    public void addCustomer(Customer customer)
    {
        customers.add(customer);
        System.out.println("customer added");
    }
    public void removeCustomerByID(String customerId)
    {
        for(Customer customer : customers)
        {
            if(customer.customerId.equals(customerId))
            {
                customers.remove(customer);
            }
        }
    }
    public void displayAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers in the bank.");
        } else {
            for (Customer customer : customers) {
                System.out.println(customer.displayCustomerInfo());
            }
        }
    }
}
