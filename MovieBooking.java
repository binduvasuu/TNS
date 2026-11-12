package Day6;

class MovieTicket {
    String movieName;
    int price;

    MovieTicket() {
    }

    void bookTicket() {
        System.out.println(movieName);
    }

    void bookTicket(int tickets) {
        System.out.println("Total Price of Regular Ticket " + (tickets * price));
        System.out.println();
    }

    void bookTicket(int tickets, String customerName) {
        System.out.println(movieName);
        System.out.println("Number of Tickets " +tickets);
        System.out.println("Name " +customerName);
        System.out.println("Total Price of Premium Ticket " + (tickets * price));
    }

    void calculatePrice() {
        System.out.println(price);
    }
}

class RegularTicket extends MovieTicket {

    RegularTicket(String movieName, int price) {
        this.movieName = movieName;
        this.price = price;
    }

    @Override
    void calculatePrice() {
        System.out.println("Regular Ticket Price: " + price);
    }
}

class PremiumTicket extends MovieTicket {

    PremiumTicket(String movieName, int price) {
        this.movieName = movieName;
        this.price = price;
    }

    @Override
    void calculatePrice() {
        System.out.println("Premium Ticket Price: " + (price + 100));
    }
}

public class MovieBooking {
    public static void main(String[] args) {

        RegularTicket r = new RegularTicket("Avatar", 200);
        PremiumTicket p = new PremiumTicket("Avengers", 300);

        r.calculatePrice();
        p.calculatePrice();

        System.out.println();
        r.bookTicket();
        r.bookTicket(2);
        r.bookTicket(3, "Rahul");

        System.out.println();
        p.bookTicket();
        p.bookTicket(2);
        p.bookTicket(3, "Amit");
    }
}