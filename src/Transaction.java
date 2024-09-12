import java.time.LocalDateTime;
public class Transaction {
    public int transactionID;
    public Account account;
    public float amount;
    public localDateTime date;

    public Transaction(int transactionID,Account account,float amount)
    {
        this.transactionID=transactionID;
        this.account=account;
        this.amount=amount;
    }

}
