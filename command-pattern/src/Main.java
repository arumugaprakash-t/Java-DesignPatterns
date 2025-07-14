import implementations.KitchenLightOffCommand;
import implementations.KitchenLightOnCommand;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      // consider a remote with 2 buttons: one for "on" and one for "off" and 2 sections homelight and kitchen light
        try {
            RemoteControll remote = new RemoteControll();
            components.KitchenLight kitchenLight = new components.KitchenLight();

            KitchenLightOnCommand kitchenLightOnCommand = new KitchenLightOnCommand(kitchenLight);
            KitchenLightOffCommand kitchenLightOffCommand = new implementations.KitchenLightOffCommand(kitchenLight);

            remote.onButtonWasPressed(0); // this should tell no command is set yet
            remote.setCommand(0, kitchenLightOnCommand, kitchenLightOffCommand);

            System.out.println("Testing Kitchen Light Commands:");
            remote.onButtonWasPressed(0); // Turn on the kitchen light
            remote.offButtonWasPressed(0); // Turn off the kitchen light
            remote.wasUndoButtonWasPressed(); // Undo the last action (should turn on the kitchen light again)
        }catch (Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}