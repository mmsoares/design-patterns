package command;

import command.commands.DecreaseTemperatureCommand;
import command.commands.IncreaseTemperatureCommand;
import command.model.AirConditioner;
import command.model.RemoteControl;

class CommandMain {
    public static void main(String[] args) {
        AirConditioner bedroomAirConditioner = new AirConditioner();

        RemoteControl remoteControl = new RemoteControl(
                new IncreaseTemperatureCommand(bedroomAirConditioner),
                new DecreaseTemperatureCommand(bedroomAirConditioner)
        );

        remoteControl.upKeyPressed();
        remoteControl.downKeyPressed();
        remoteControl.upKeyPressed();
        remoteControl.upKeyPressed();
        remoteControl.downKeyPressed();
        remoteControl.upKeyPressed();

        remoteControl.undo();
        remoteControl.undo();
        remoteControl.undo();
        remoteControl.undo();
        remoteControl.undo();
        remoteControl.undo();
        remoteControl.undo();
    }
}
