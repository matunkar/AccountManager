package accounts;

public class CreditAccount extends Account {
    private double creditLimit;
    private double interestRate;
    private int gracePeriod;
    private int date;

    public CreditAccount(int acctNum, double creditLimit, double interestRate, int gracePeriod, double balance) {
        super(acctNum, balance);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
        this.gracePeriod = gracePeriod;

    }

    public void increaseLimit(double amt) {
        this.creditLimit += amt;
    }
    public double getCurrentCreditLimit() {
        return creditLimit - balance;
    }
    public void payCreditBalance(double amt) {
        balance -= amt;
    }


}
