package Day6;

class ParkingSys {
    String number;

    void calculateCharges(){
        System.out.println(number);
    }

    void calculateCharges(int hours){
        System.out.println(hours*20);
    }

}

class CarParking extends ParkingSys{
    CarParking(String number){
        this.number = number;
    }

    @Override 
    void calculateCharges(){
        System.out.println(number);
        System.out.println("50 per hour");
    }
}

class BikeParking extends ParkingSys{
    BikeParking(String number){
       this.number = number;
    }

     @Override 
    void calculateCharges(){
        System.out.println(number);
        System.out.println("20 per hour");
    }
}

class TruckParking extends ParkingSys{
    TruckParking(String number){
        this.number = number;
    }

     @Override 
    void calculateCharges(){
        System.out.println(number);
        System.out.println("80 per hour");
    }
}


public class Parking{
    public static void main(String[] args) {
        CarParking c = new CarParking("KA 05 B1234");
        BikeParking b = new BikeParking("KA 09 3456");
        TruckParking t = new TruckParking("KA 03 6789");

        c.calculateCharges();
        b.calculateCharges();
        t.calculateCharges();

        c.calculateCharges(2);
        b.calculateCharges(5);
        t.calculateCharges(1);
        
    }
}