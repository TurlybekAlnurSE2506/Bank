import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
    private int customer_id;
    private String name;
    private String surname;
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public Customer(int customer_id, String name, String surname,  ArrayList<BankAccount> bankAccounts) {
        this.customer_id = customer_id;
        this.name = name;
        this.surname = surname;
        this.bankAccounts = bankAccounts;
    }
    public void addAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }
    public String getTotalBalance() {
        int total = 0;
        for (BankAccount bankAccount : bankAccounts) {
            total += bankAccount.getBalance();
        }
        return "Общий баланс: " + total;
    }
    public String displayCustomer(){
        return "ФИО: " + name + " " + surname +
                "\nАккаунты: " + bankAccounts +
                "\n" + getTotalBalance();
    }
    public int getCustomer_id() {
        return customer_id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
