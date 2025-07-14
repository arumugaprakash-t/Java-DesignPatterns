package implementations;

import components.KitchenLight;
import interfaces.command;

public class KitchenLightOffCommand implements command {
    private KitchenLight kitchenLight;

    public KitchenLightOffCommand(KitchenLight kitchenLight) {
        this.kitchenLight = kitchenLight;
    }

    public void execute() {
        kitchenLight.turnOff();
    }

    public void undo() {
        kitchenLight.turnOn();
    }
}
