public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(int account_id, String user_name, String password, int balance, double interestRate) {
        super(account_id, user_name, password, balance);
        this.interestRate = interestRate;
    };

    @Override
    public void calculateInterest() {
        setBalance((int) (balance * interestRate));
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
