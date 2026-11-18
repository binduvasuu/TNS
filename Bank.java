package Nov12.Bank;

public class Bank {
    private int balance = 5000;

    public int getBalance(){
        System.out.println("Balance is");
        return balance;
    }

    public void withdraw(int amount){
        System.out.println();
        System.out.println(amount + "  Withdraw successfull");
        balance = balance - amount;
    }

    public void deposite(int amount){
        System.out.println();
        System.out.println(amount + "  Amount is credited");
        balance = balance + amount;
        System.out.println("Balance is " +balance);
    }

    
}
