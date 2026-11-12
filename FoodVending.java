package Day6;

class VendingMachine {
    String itemName;
    int price;

    void purchase() {
        System.out.println(itemName);
    }

    void purchase(int quantity) {
        System.out.println("Total Price: " + (price * quantity));
    }

    void purchase(double amount) {
        if (amount >= price) {
            System.out.println("Purchase Successful");
            System.out.println("Balance: " + (amount - price));
        } else {
            System.out.println("Insufficient Amount");
        }
    }

    void displayItem() {
        System.out.println(itemName);
        System.out.println("Price: " + price);
    }
}

class SnackMachine extends VendingMachine {
    SnackMachine(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    @Override
    void displayItem() {
        System.out.println(itemName);
        System.out.println("Snack Price: " + price);
    }
}

class DrinkMachine extends VendingMachine {
    DrinkMachine(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
    }

    @Override
    void displayItem() {
        System.out.println(itemName);
        System.out.println("Drink Price: " + price);
    }
}

public class FoodVending {
    public static void main(String[] args) {

        SnackMachine s = new SnackMachine("Chips", 20);
        DrinkMachine d = new DrinkMachine("Juice", 30);

        s.displayItem();
        d.displayItem();
        
        s.purchase();
        s.purchase(3);
        s.purchase(50.0);

        d.purchase();
        d.purchase(2);
        d.purchase(20.0);
    }
}