package implementations;

import components.KitchenLight;
import interfaces.command;

public class KitchenLightOnCommand implements command {

    private KitchenLight kitchenLight;

    public KitchenLightOnCommand(KitchenLight kitchenLight) {
        this.kitchenLight = kitchenLight;
    }

    @Override
    public void execute() {
        kitchenLight.turnOn();
    }

    @Override
    public void undo() {
        kitchenLight.turnOff();
    }
}
