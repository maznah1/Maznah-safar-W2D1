package Package;

public class Account {
    public int id;
    public Customer customer;
    public double balance = 0.0;


    public Account(int id, Customer customer, double balance) {
    }

    public Account(int id, Customer customer) {
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", customer=" + customer +
                ", balance=" + balance +
                '}';
    }

    public String getCustomerName() {

        return getCustomerName();

    }

    public Account deposit(double amount) {


        return null;
    }

    public Account withdraw(double amount) {


        if (balance >= amount) {

            System.out.println("subtract amount to balance");
        } else {

            System.out.println("amount wihdraw exceeds the current balance!");


        }

        return null;
    }
}
