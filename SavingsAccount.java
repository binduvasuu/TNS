package Nov18.BankSystem;

public class SavingsAccount {
    int balance = 1000;

    void withraw(int amount)throws BankException{
        if(amount>balance){
            throw new BankException("Insufficient Amount");
            //System.out.println("Insufficient Amount");
        }
        System.out.println(amount + " debited from your account");
        balance -= amount;
    }

    void deposite(int amount){
        System.out.println(amount + " credited to your account");
        balance += amount;
    }

    void getBalance(){
        System.out.println("Balance = " + balance);
    }
}
