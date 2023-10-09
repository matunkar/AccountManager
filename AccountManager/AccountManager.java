package AccountManager;
import java.util.HashMap;
import accounts.*;
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

    public void openAccount(Integer acctNum, String accountType, String accountName) {

        Account newAccount;

        switch (accountType) {
            case "CreditAccount":
                newAccount = new CreditAccount(acctNum);
                accountsMap.put(acctNum, newAccount);
                break;
            case "LoanAccount":
                newAccount = new LoanAccount(acctNum);
                accountsMap.put(acctNum, newAccount);
                break;
            case "BankAccount":
                newAccount = new BankAccount(acctNum);
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
