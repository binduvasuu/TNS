package Nov18.BankSystem;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sv = new SavingsAccount();
        sv.getBalance();
        try{
            System.out.println("Withdraw amount ");
            sv.withraw(2000);
        }
        catch(BankException e){
            System.out.println(e.getMessage());
            sv.getBalance();
        }
    }
}
