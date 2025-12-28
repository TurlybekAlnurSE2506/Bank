import java.util.ArrayList;

public class ApplicationMain {
    public static void main(String[] args) {
        BankAccount account1 = new SavingAccount(1, "mark_super", "steak001",3000, 0.03);
        BankAccount account2 = new CheckingAccount(2, "fire_jason", "banana007",7000, 1000);
        BankAccount account3 = new SavingAccount(3, "juice","juice008" ,5000, 0.02);

        Customer customer1 = new Customer(1, "Mark", "Greyson", new ArrayList<>());
        Customer customer2 = new Customer(2, "Jason", "Yellow",new ArrayList<>());
        Customer customer3 = new Customer(3, "Josh", "Green",new ArrayList<>());

        Bank bank1 = new Bank(1, "Alpha", new ArrayList<>(),  new ArrayList<>());

        bank1.addCustomer(customer1);
        bank1.addCustomer(customer2);
        bank1.addCustomer(customer3);

        customer1.addAccount(account1);
        customer1.addAccount(account2);
        customer2.addAccount(account3);

        bank1.applyInterestToAll();

        System.out.println(account1);
        System.out.println(customer1);
        System.out.println(bank1);

        if (account1.getBalance() == account2.getBalance()) {
            System.out.println("Баланс равен");
        } else if (account1.getBalance() < account2.getBalance()) {
            System.out.println("У второго пользователя баланс больше");
        } else {
            System.out.println("У первого пользователя баланс больше");
        }
    }
}
