import java.util.ArrayList;

public class Bank {
    private int bank_id;
    private String bank_name;
    private final ArrayList<Customer> customers;

    public Bank(int bank_id, String bank_name) {
        this.bank_id = bank_id;
        this.bank_name = bank_name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }
    private int customerCount(){
        return customers.size();
    }

    public String displayBank(){
        return "Название банка: " + bank_name +
                "\nКоличество клиентов: " + customerCount();
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

}
