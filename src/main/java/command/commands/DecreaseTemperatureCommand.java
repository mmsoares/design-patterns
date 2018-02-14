package command.commands;

import command.model.AirConditioner;
import org.apache.log4j.Logger;

public class DecreaseTemperatureCommand implements Command {
    private static final Logger LOGGER = Logger.getLogger(DecreaseTemperatureCommand.class);

    private final AirConditioner airConditioner;

    public DecreaseTemperatureCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.decreaseTemperature();
    }

    @Override
    public void undo() {
        LOGGER.info("Undoing decrease temperature");
        airConditioner.increaseTemperature();
    }
}
