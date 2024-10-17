
/*
accountNumber: int final
counter: int
balance: double
Method: Account()

getAccountType(): AccountType
withdraw (amount : double) : void
deposit (amount: double) : void
getInterestRate (balance:double, amount: double) : double
getTransactionFee (accountType: AccountType): double
printAccountInfo() : String
printTotalNumberOfAccounts(): void
 */
public class Account {

    private final int accountNumber;
    private int counter;
    private double balance;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
