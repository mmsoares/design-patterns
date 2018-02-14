package strategy.calculators;

public class CaliforniaTaxCalculator implements StateTaxCalculator {
    @Override
    public double getStateTaxRate() {
        return 0.25;
    }
}
