public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public  CheckingAccount(int account_id, String user_name, String password, int balance, double overdraftLimit) {
        super(account_id, user_name, password, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void calculateInterest(){
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
