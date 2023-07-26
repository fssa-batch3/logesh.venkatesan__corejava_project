

package day05.practice;



class Account {
    private String accNo;
    private double balance;

    // Constructor
    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    // Getters and setters
    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// Interface
public interface ATM {
    boolean deposit(Account account, double amount);
    boolean withdraw(Account account, double amount) throws Exception;
    double getBalance(Account account); // Pass the Account object as a parameter
}

// Implementation
class AxisATM implements ATM {
    private static final double WITHDRAWAL_CHARGE = 5;

    @Override
    public boolean deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        return true;
    }

    @Override
    public boolean withdraw(Account account, double amount) throws Exception {
        if (account.getBalance() < 5000) {
            throw new Exception("Insufficient balance. Minimum balance of 5000 required.");
        }

        double totalAmount = amount + WITHDRAWAL_CHARGE;
        if (account.getBalance() >= totalAmount) {
            account.setBalance(account.getBalance() - totalAmount);
            return true;
        } else {
            throw new Exception("Insufficient balance.");
        }
    }

    @Override
    public double getBalance(Account account) { // Add the Account object as a parameter
        return account.getBalance();
    }
}

class IciciATM implements ATM {
    private static final double WITHDRAWAL_CHARGE = 10;

    @Override
    public boolean deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        return true;
    }

    @Override
    public boolean withdraw(Account account, double amount) throws Exception {
        if (account.getBalance() < 10000) {
            throw new Exception("Insufficient balance. Minimum balance of 10000 required.");
        }

        double totalAmount = amount + WITHDRAWAL_CHARGE;
        if (account.getBalance() >= totalAmount) {
            account.setBalance(account.getBalance() - totalAmount);
            return true;
        } else {
            throw new Exception("Insufficient balance.");
        }
    }

    @Override
    public double getBalance(Account account) { // Add the Account object as a parameter
        return account.getBalance();
    }
}



/*
 * 
 * This code represents a simple banking system that simulates two different types of ATM  machines: AxisATM and IciciATM.
 *  The code consists of three classes: Account, AxisATM, and IciciATM, as well as an interface called ATM.
 *  The Account class represents a bank account and has private fields for the account number (accNo) and the
 *   account balance (balance). It also provides getters and setters for these fields.The ATM interface defines a 
 *   set of methods that an ATM should implement. It includes the following methods:
boolean deposit(Account account, double amount): Deposits the specified amount into the given account.
boolean withdraw(Account account, double amount) throws Exception: Withdraws the specified amount from the given account.
 It throws an exception if the account balance is insufficient.
double getBalance(): Retrieves the current balance of the account.
The AxisATM class implements the ATM interface and represents an ATM machine provided by the Axis bank. 
It has a constant WITHDRAWAL_CHARGE that specifies the withdrawal charge for using this ATM.
 It provides implementations for the methods defined in the ATM interface:

deposit: Adds the specified amount to the account balance.
withdraw: Checks if the account balance is sufficient, and if so, deducts the withdrawal amount along 
with the withdrawal charge from the account balance.
getBalance: Retrieves the current balance of the account.
The IciciATM class is similar to the AxisATM class but represents an ATM machine provided by the ICICI bank. 
It also has a constant WITHDRAWAL_CHARGE specific to ICICI ATMs.

Overall, this code provides a basic structure for modeling bank accounts and implementing different types of ATM machines.
 */

