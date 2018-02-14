package command.model;

import command.commands.Command;
import org.apache.log4j.Logger;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoteControl {
    private static final Logger LOGGER = Logger.getLogger(RemoteControl.class);

    private final Command upCommand;
    private final Command downCommand;
    private final Deque<Command> pastCommands;

    public RemoteControl(Command upCommand, Command downCommand) {
        this.upCommand = upCommand;
        this.downCommand = downCommand;
        this.pastCommands = new ArrayDeque<>();
    }

    public void upKeyPressed() {
        pastCommands.push(upCommand);
        upCommand.execute();
    }

    public void downKeyPressed() {
        pastCommands.push(downCommand);
        downCommand.execute();
    }

    public void undo() {
        if (!pastCommands.isEmpty()) {
            Command commandToUndo = pastCommands.pop();
            commandToUndo.undo();
        } else {
            LOGGER.warn("There are no commands to undo.");
        }
    }
}
