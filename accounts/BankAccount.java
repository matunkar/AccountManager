package accounts;

public class BankAccount extends Account {
    public enum AccountType {
        CHECKING, 
        SAVINGS;
    }
    public BankAccount(int acctNum, double balance) {
        super(acctNum, balance);
    }
}
