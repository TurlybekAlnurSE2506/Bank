import java.util.ArrayList;

public class Bank {
    private int bank_id;
    private String bank_name;
    private final ArrayList<Customer> customers;
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Bank(int bank_id, String bank_name, ArrayList<Customer> customers, ArrayList<BankAccount> accounts) {
        this.bank_id = bank_id;
        this.bank_name = bank_name;
        this.customers = customers;
        this.accounts = accounts;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    private int customerCount() {
        return customers.size();
    }

    public void applyInterestToAll(){
        for(BankAccount acc : accounts){
            acc.calculateInterest();
        }
    }
    public String filterByBalance(double filterBalance){
        for(BankAccount acc : accounts){
            if(acc.balance <=  filterBalance){
                return acc.toString();
            } else{
                return null;
            }
        }
        return null;
    }
    public BankAccount findByUser(String username){
        for(BankAccount acc : accounts){
            if(acc.user_name.equals(username)){
                return acc;
            }
        }
        return null;
    }
    @Override
    public String toString(){
        return "Bank name: " + bank_name +
                "\nAmount of clients: " + customerCount();
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public int getBank_id() {
        return bank_id;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public void setAccounts(ArrayList<BankAccount> accounts) {
        this.accounts = accounts;
    }
}