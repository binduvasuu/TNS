
package oops.polymorphism;

public class Payment {
    void pay() {
        System.out.println("Payment");
    }
}

class GooglePay extends Payment {
    @Override
    void pay() {
        System.out.println("Paid via Google Pay");
    }
}

class CreditCard extends Payment {
    @Override
    void pay() {
        System.out.println("Paid via Credit Card");
    }
}

class NetBanking extends Payment {
    @Override
    void pay() {
        System.out.println("Paid via Net Banking");
    }
}

class Main {
    public static void main(String[] bindu) {

        Payment p;

        p = new GooglePay();
        p.pay();

        p = new CreditCard();
        p.pay();

        p = new NetBanking();
        p.pay();
    }
}
