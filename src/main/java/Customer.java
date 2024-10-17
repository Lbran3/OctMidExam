/*
firstName: string final
lastName string final
account: account final
method = firstName: string, lastName : string, account: Account

 */
public class Customer {

    private  final String firstName;
    private final String lastName;
    private final Account account;

    public Customer(String firstName, String lastName, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;

    }

    public Account getAccount() {
        return account;
    }
}
