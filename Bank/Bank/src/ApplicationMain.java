import java.util.ArrayList;

public class ApplicationMain {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1, "mark_super", "steak001", 3000);
        BankAccount account2 = new BankAccount(2, "fire_jason", "banana007", 7000);
        BankAccount account3 = new BankAccount(3, "juice", "juice008", 5000);

        Customer customer1 = new Customer(1, "Mark", "Greyson",new ArrayList<>() );
//        Customer customer2 = new Customer(2, "Jason", "Yellow", account2);
        Customer customer3 = new Customer(3, "Josh", "Green", new ArrayList<>());
        Bank bank1 = new Bank(1, "Alpha");
        bank1.addCustomer(customer1);
        customer1.addAccount(account1);
        customer1.addAccount(account2);
        customer1.getTotalBalance();
        //        bank1.addCustomer(customer2);
        bank1.addCustomer(customer3);


        System.out.println(account1.displayInfo());
        System.out.println(customer1.displayCustomer());
        System.out.println(bank1.displayBank());

        if(account1.getBalance() == account2.getBalance()){
            System.out.println("Баланс равен");
        } else if (account1.getBalance() < account2.getBalance()) {
            System.out.println("У второго пользователя баланс больше");
        } else {
            System.out.println("У первого пользователя баланас больше");
        }
    }
}
