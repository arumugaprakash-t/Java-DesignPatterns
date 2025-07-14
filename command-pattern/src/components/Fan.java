package components;

public class Fan {
    private boolean isOn;

    public Fan() {
        this.isOn = false;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Fan is ON");
        } else {
            System.out.println("Fan is already ON");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Fan is OFF");
        } else {
            System.out.println("Fan is already OFF");
        }
    }

    public boolean isOn() {
        return isOn;
    }
}
