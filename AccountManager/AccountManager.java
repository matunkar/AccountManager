package AccountManager;
import java.util.HashMap;
import accounts.*;
import accounts.BankAccount.AccountType;

import java.util.Iterator;

public class AccountManager {
    private static AccountManager instance;
    HashMap<Integer, Account> accountsMap = new HashMap<Integer, Account>();
   
    public static AccountManager getInstance() {
        if (null == instance) {
            instance = new AccountManager();
        }

        return instance;
    }

    public Account getAccount(Integer acctNum) {
        return accountsMap.get(acctNum);
    }

    public void listAccount() {
        for (Account i: accountsMap.values()) {
            System.out.println(i);
        }
    }

    public void openAccount(Integer acctNum, String accountType, double balance, AccountType type, double interestRate, double creditLimit, int gracePeriod) {

        Account newAccount;

        switch (accountType) {
            case "CreditAccount":
                newAccount = new CreditAccount(acctNum, creditLimit, interestRate, gracePeriod, balance);
                accountsMap.put(acctNum, newAccount);
                break;
            case "LoanAccount":
                newAccount = new LoanAccount(acctNum, balance);
                accountsMap.put(acctNum, newAccount);
                break;
            case "BankAccount":
                newAccount = new BankAccount(acctNum, balance);
                accountsMap.put(acctNum, newAccount);
                break;
            default:
                while (1==1) {
                    System.out.println("KILL!");
                }
        }


    }
    
    public void closeAccount(int acctNum) {

    }
}
