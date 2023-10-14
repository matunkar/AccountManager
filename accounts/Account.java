package accounts;

public abstract class Account {
    public int acctNum;
    public double balance;
    
    public Account(int acctNum, double balance) {

    }

    public int returnAcctNum() {
        return acctNum;
    }
    public double getBalance() {
        return balance;
    }


}
