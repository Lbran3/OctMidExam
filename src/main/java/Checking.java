public class Checking extends Account {
//has a balance
//needs to be able to withdraw money; withdraw fee= $5 everytime you withdraw (so a loop is need)
    private static final double withdrawFee = 5;

    public Checking(int accountNumber, double balance) {
        super(accountNumber, balance );
    }

    @Override
    public String getAccountType() {
        return "This is Checking Account";
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        // withdraw fee= $5
        if(amount + withdrawFee > getBalance()){
            System.out.println();
        }
    }
}
