package strategy.calculators;

public class TexasTaxCalculator implements StateTaxCalculator{
    @Override
    public double getStateTaxRate() {
        return 0.15;
    }
}
