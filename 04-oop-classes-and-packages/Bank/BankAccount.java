package Bank;

class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accNum, String accName){
        accountNumber = accNum;
        accountHolderName = accName;
    }

    public void deposit(double money){
        if(money <= 0){
            System.out.println("Invalid Deposit");
        }
        else{
            balance += money;
            System.out.println("Successfull deposit, balance is: " + balance);

        }
    }

    public void withdraw(double money){
        if(money <= 0 || balance < money){
            System.out.println("Invalid Withdrawal");
        }
        else{
            balance -= money;
            System.out.println("Successfull withdrawal, balance is: " + balance);
        }
    }
}
