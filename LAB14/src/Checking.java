public class Checking extends Account{

    private Money overdraftMaximum;
    public Checking(String name, String id, Money balance) {
        super(name, id, balance);
        this.overdraftMaximum = new Money(100,0);
    }

    @Override
    public void withdraw(Money amount) {
        if(lessThan(amount,overdraftMaximum)){
            super.withdraw(amount);
        } else {
            System.out.println("You are withdrawing more than your overdraft amount");
        }

    }

    public boolean lessThan(Money amount, Money overdraftMaximum) {
        return amount.compareTo(getBalance().add(overdraftMaximum)) <= 0;
    }
}
