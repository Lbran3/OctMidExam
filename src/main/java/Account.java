
/*
accountNumber: int final
counter: int (underlined meaning static)
balance: double
Method: Account()

getAccountType(): AccountType; (italized in UML so this is an abstract class)
withdraw (amount : double) : void
deposit (amount: double) : void
getInterestRate (balance:double, amount: double) : double
getTransactionFee (accountType: AccountType): double
printAccountInfo() : String
printTotalNumberOfAccounts(): void
 */
public abstract class Account {

    private final int accountNumber;
    private int counter;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.counter = 0;
    }
    public abstract String getAccountType();

    public void withdraw(double amount) {

    }


    public void deposit(double amount){

    }
    public double getinterestRate(double balance, double amount){
        return getinterestRate();
    }


    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


}
