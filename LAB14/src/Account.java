public class Account {
    private String name;
    private String id;
    private Money balance;

    public Account(String name, String id, Money balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public void deposit(Money amount) {
        balance = balance.add(amount);
    }

    public void withdraw(Money amount) {
        balance = balance.subtract(amount);
    }

    public void transfer(Account destination, Money amount) {
        withdraw(amount);
        destination.deposit(amount);
    }

    public Money getBalance() {
        return this.balance;
    }

    public String toString() {
        return name + " (" + id + "): " + balance.toString();
    }

    public String getId(){
        return this.id;
    }

    public boolean equals(Account other) {
        return this.id.equals(other.id);
    }

}