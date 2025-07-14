import interfaces.command;

public class RemoteControll {

    private command[] onCommands;
    private command[] offCommands;

    private command undoCommand;


    public RemoteControll() {
        onCommands = new command[7];
        offCommands = new command[7];

        command noCommand = new implementations.NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, command onCommand, command offCommand) {
        // have safety check for slot
        if (slot < 0 || slot >= onCommands.length) {
            throw new IllegalArgumentException("Slot must be between 0 and " + (onCommands.length - 1));
        }

        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        // have safety check for slot
        if (slot < 0 || slot >= onCommands.length) {
            throw new IllegalArgumentException("Slot must be between 0 and " + (onCommands.length - 1));
        }

        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        // have safety check for slot
        if (slot < 0 || slot >= offCommands.length) {
            throw new IllegalArgumentException("Slot must be between 0 and " + (offCommands.length - 1));
        }

        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void wasUndoButtonWasPressed() {
        undoCommand.undo();
    }
}
