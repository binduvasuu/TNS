package Day5.constructor;

class Person{
    int balance;
    String name;


    Person(int balance, String name){
    this.balance = balance;
    this.name = name;
}

    Person(){
        System.out.println("Constructor");
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Person p1 = new Person(1000, "Bindu");
        System.out.println(p1.name);
        System.out.println(p1.balance);
        Person p2 = new Person();
        System.out.println(p2.balance);
        System.out.println(p2.name);

        
    }

}
