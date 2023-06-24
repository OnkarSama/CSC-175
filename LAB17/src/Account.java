public class Account implements Comparable {
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

    @Override
    public int compareTo(Object o) {
        if(o instanceof Account) {
            if(this.id.equals(((Account) o).id)){
                return 0;
            }else if(this.id.compareTo(((Account) o).id) < 0){
                return -1;
            }else {
                return 1;
            }
        } else {
            throw new ClassCastException("Object being compared isn't a class");
        }
    }
}