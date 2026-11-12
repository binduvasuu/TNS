package staticandnonstatic;

//non-static = any member will not declare as static is called non static of the class
// non-static member can be accessed by reference name.member name
//non-static also associated by reference name or object
//non-static is multiple copy 

class Bank{
    int bal = 2000;
    static int empID = 1;
    void showBal(){
        System.out.println(bal);
    }

    void showId(){
        System.out.println(empID);
    }
}

public class NonStatic {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.showBal();
        bank.showId();

        Bank bank2 = new Bank();
        bank2.bal = 4000;
        bank2.empID = 4;
        bank2.showBal();
        bank2.showId();

        Bank bank3 = new Bank();
        bank3.bal = 3000;
        bank3.showBal();
        bank3.showId();

        Bank bank4 = new Bank();
        bank4.showBal();
        bank4.showId();

    }
}
