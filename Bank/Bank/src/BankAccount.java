public class BankAccount {
    private int account_id;
    private String user_name;
    private String password;
    private int balance;

    public BankAccount(int account_id, String user_name, String password, int balance) {
        this.account_id = account_id;
        this.user_name = user_name;
        this.password = password;
        this.balance = balance;
    }
    public int deposit(int amount){
        balance = balance + amount;
        return balance;
    }
    public int withdraw(int amount){
        if(balance >= amount && amount >= 0){
            balance = balance - amount;
        } else {
            System.out.println("Недостаточно средств");
        }
        return balance;
    }

    public String displayInfo(){
        return "Имя:" + user_name +
                "\nОстаток на счету: " + balance;
    }
    @Override
    public String toString(){
        return user_name = user_name;
    }
    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    public int getBalance() {
        return balance;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }
}
