import java.util.*;

interface SmartDevice {
    void turnon();
    void turnoff();
}

class Fan implements SmartDevice {
    public void turnon() {
        System.out.println("Fan on");
    }

    public void turnoff() {
        System.out.println("Fan off");
    }
}

class Light implements SmartDevice {
    public void turnon() {
        System.out.println("Light on");
    }

    public void turnoff() {
        System.out.println("Lights off");
    }
}

class AirConditioner implements SmartDevice {
    public void turnon() {
        System.out.println("AC is on");
    }

    public void turnoff() {
        System.out.println("AC is off");
    }
}

public class Dev {
    public static void main(String[] args) {
        SmartDevice f = new Fan();
        f.turnon();
        f.turnoff();

        SmartDevice l = new Light();
        l.turnon();
        l.turnoff();

        SmartDevice ac = new AirConditioner();
        ac.turnon();
        ac.turnoff();
    }
}