public class Checking extends Account{

    private Money overdraftMaximum;
    public Checking(String name, String id, Money balance , Money overdraftMaximum) {
        super(name, id, balance);
        this.overdraftMaximum = overdraftMaximum;
    }

    @Override
    public void withdraw(Money amount) {


        if(lessThan(amount,overdraftMaximum)){
            super.withdraw(amount);
        } else {
            throw new InsufficientFundsException("Trying to withdraw too much");
        }



    }

    public boolean lessThan(Money amount, Money overdraftMaximum) {
        return amount.compareTo(getBalance().add(overdraftMaximum)) <= 0;
    }
}
