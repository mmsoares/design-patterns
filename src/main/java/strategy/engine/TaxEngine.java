package strategy.engine;

import strategy.calculators.StateTaxCalculator;

public class TaxEngine {
    private static final double FEDERAL_TAX_RATE = 0.05;

    private final StateTaxCalculator stateTaxCalculator;

    public TaxEngine(StateTaxCalculator stateTaxCalculator) {
        this.stateTaxCalculator = stateTaxCalculator;
    }

    public double getTaxRate() {
        return FEDERAL_TAX_RATE + stateTaxCalculator.getStateTaxRate();
    }
}