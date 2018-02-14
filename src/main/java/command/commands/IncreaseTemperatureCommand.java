package command.commands;

import command.model.AirConditioner;
import org.apache.log4j.Logger;

public class IncreaseTemperatureCommand implements Command {
    private static final Logger LOGGER = Logger.getLogger(IncreaseTemperatureCommand.class);

    private final AirConditioner airConditioner;

    public IncreaseTemperatureCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.increaseTemperature();
    }

    @Override
    public void undo() {
        LOGGER.info("Undoing increase temperature");
        airConditioner.decreaseTemperature();
    }
}
