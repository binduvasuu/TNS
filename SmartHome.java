
package Day6;

class SmartDevice {
    String name;

    SmartDevice() {
    }

    SmartDevice(String name) {
        this.name = name;
    }

    void turnOn() {
        System.out.println(name + " is ON");
    }

    void control(int x) {
        System.out.println("Level: " + x);
    }

    void control(String x) {
        System.out.println("Mode: " + x);
    }
}

class SmartLight extends SmartDevice {
    SmartLight(String name) {
        this.name = name;
    }

    void turnOn() {
        System.out.println(name + " Light is ON");
    }
}

class SmartFan extends SmartDevice {
    SmartFan(String name) {
        this.name = name;
    }

    void turnOn() {
        System.out.println(name + " Fan is ON");
    }
}

class SmartAC extends SmartDevice {
    SmartAC(String name) {
        this.name = name;
    }

    void turnOn() {
        System.out.println(name + " AC is ON");
    }
}

public class SmartHome {
    public static void main(String[] args) {

        SmartLight l = new SmartLight("Philips");
        SmartFan f = new SmartFan("Orient");
        SmartAC a = new SmartAC("Voltas");

        l.turnOn();
        f.turnOn();
        a.turnOn();

        l.control(50);
        f.control("Speed");
    }
}
