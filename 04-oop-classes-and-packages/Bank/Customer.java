package Bank;

public class Customer {
    
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("001", "Rohan");
        b1.deposit(100);
        b1.withdraw(200);
        b1.deposit(-40);
        b1.withdraw(0);
        b1.withdraw(40);
    }
}
