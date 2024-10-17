/*
withdrawal transaction fee of $10 for all savings
 */
public abstract class Savings extends Account {


    public Savings(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public String getAccountType() {
        return "This is Savings Account";
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);

    }
}
