package components;

public class KitchenLight {
    private boolean isOn;

    public KitchenLight() {
        this.isOn = false;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Kitchen light is ON");
        } else {
            System.out.println("Kitchen light is already ON");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Kitchen light is OFF");
        } else {
            System.out.println("Kitchen light is already OFF");
        }
    }

    public boolean isOn() {
        return isOn;
    }
}
