package Interface1;

interface SmartDevice {
    void turnOn();
    void turnOff();
    void status();
}

class SmartLight implements SmartDevice {
    boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("SmartLight is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("SmartLight is now OFF.");
    }

    public void status() {
        System.out.println("SmartLight status: " + (isOn ? "ON" : "OFF"));
    }
}

class SmartFan implements SmartDevice {
    boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("SmartFan is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("SmartFan is now OFF.");
    }

    public void status() {
        System.out.println("SmartFan status: " + (isOn ? "ON" : "OFF"));
    }
}

class SmartDeviceDemo {
    public static void main(String[] args) {
        SmartDevice device = new SmartFan(); // or new SmartLight();
        device.turnOn();
        device.status();
    }
}
