public class Main {
 /*
  Your Bank must be able to add customers and keep a list of them
Every account created must have a unique accountNumber
be able to track the number sof accounts created
Customers can make deposits and withdrawals
Customers cannot deposit negative values if they do print an message such as Invalid amount
If a customer tries to withdraw more than their balance plus fees then print an message such as Insufficient Funds
IMPORTANT:
Accounts with balances over $1000 recieve a 10% interest added to their balance when they make a deposit while accounts with less that $1000 get a 5% interest added to their balance when they make a deposit
There is a withdrawal transactionFee of $5 for all checking accounts
There is withdrawal transactionFee of $10 for all savings accounts


  */
    public static void main(String[] args) {
      //create bank object
        Bank bank = new Bank();

        //create a checking account named checkingAccount1
        Checking checkingAccount1 = new Checking();
        //create a customer account named customer1
        Customer customer1 = new Customer();
        //add customer1 to a list of bank customers

        //deposit $2000 into customer 1 checking account



        //withdraw $100 from customer1 checking
        // withdraw another $50 from c1 checking
        //attempt to deposit (-) deposit
    }
}
