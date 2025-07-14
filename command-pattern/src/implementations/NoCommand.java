package implementations;

import interfaces.command;

public class NoCommand implements command {
    @Override
    public void execute() {
        System.out.println("No command assigned.");
    }

    @Override
    public void undo() {
        System.out.println("No command to undo.");
    }
}
