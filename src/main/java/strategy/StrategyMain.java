package strategy;

import org.apache.log4j.Logger;
import strategy.calculators.CaliforniaTaxCalculator;
import strategy.calculators.TexasTaxCalculator;
import strategy.engine.TaxEngine;

class StrategyMain {
    private static final Logger LOGGER = Logger.getLogger(StrategyMain.class);

    public static void main(String[] args) {
        TaxEngine californiaTaxEngine = new TaxEngine(new CaliforniaTaxCalculator());
        TaxEngine texasTaxEngine = new TaxEngine(new TexasTaxCalculator());

        LOGGER.info("The tax rate for California is: " + californiaTaxEngine.getTaxRate() * 100 + "%");
        LOGGER.info("The tax rate for Texas is: " + texasTaxEngine.getTaxRate() * 100 + "%");
    }
}
