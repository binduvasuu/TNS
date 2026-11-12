
package Day6;

class Cab {
    String driverName, vehicleNo;

    Cab() {
    }

    Cab(String d, String v) {
        this.driverName = d;
        this.vehicleNo = v;
    }

    void bookCab(String pickup, String destination) {
        System.out.println("Pickup: " + pickup);
        System.out.println("Destination: " + destination);
    }

    void bookCab(String pickup, String destination, int passengers) {
        System.out.println("Pickup: " + pickup);
        System.out.println("Destination: " + destination);
        System.out.println("Passengers: " + passengers);
    }

    void calculateFare() {
        System.out.println("Cab Fare");
    }
}

class MiniCab extends Cab {
    MiniCab(String d, String v) {
        this.driverName = d;
        this.vehicleNo = v;
    }

    void calculateFare() {
        System.out.println("Mini Cab Fare: Rs.100");
    }
}

class SedanCab extends Cab {
    SedanCab(String d, String v) {
        this.driverName = d;
        this.vehicleNo = v;
    }

    void calculateFare() {
        System.out.println("Sedan Cab Fare: Rs.200");
    }
}

class SUV extends Cab {
    SUV(String d, String v) {
        this.driverName = d;
        this.vehicleNo = v;
    }

    void calculateFare() {
        System.out.println("SUV Cab Fare: Rs.300");
    }
}

public class CabBooking {
    public static void main(String[] args) {

        MiniCab m = new MiniCab("Ravi", "KA01AB1234");
        SedanCab s = new SedanCab("Raj", "KA02CD5678");
        SUV suv = new SUV("Ram", "KA03EF9012");

        System.out.println("Mini Cab");
        System.out.println("Driver: " + m.driverName);
        System.out.println("Vehicle: " + m.vehicleNo);
        m.bookCab("Mysore", "Bangalore", 2);
        m.calculateFare();

        System.out.println("\nSedan Cab");
        System.out.println("Driver: " + s.driverName);
        System.out.println("Vehicle: " + s.vehicleNo);
        s.bookCab("Bangalore", "Mysore");
        s.calculateFare();

        System.out.println("\nSUV Cab");
        System.out.println("Driver: " + suv.driverName);
        System.out.println("Vehicle: " + suv.vehicleNo);
        suv.bookCab("Chennai", "Bangalore", 4);
        suv.calculateFare();
    }
}
