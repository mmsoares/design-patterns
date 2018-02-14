package command.model;

import org.apache.log4j.Logger;

public class AirConditioner {
    private static final Logger LOGGER = Logger.getLogger(AirConditioner.class);

    private int temperature;

    public AirConditioner() {
        this.temperature = 76;
        LOGGER.info("Turned on air conditioner. Initial temperature set to " + this.temperature + "°F.");
    }

    public void increaseTemperature() {
        this.temperature++;
        LOGGER.info("Increased temperature to " + this.temperature + "°F.");
    }

    public void decreaseTemperature() {
        this.temperature--;
        LOGGER.info("Decreased temperature to " + this.temperature + "°F.");
    }
}
