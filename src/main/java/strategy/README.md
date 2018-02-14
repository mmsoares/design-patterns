Simple tax engine. Calculates the tax rate for a given state by adding the federal tax rate to the specific state's rate.

Uses the **Strategy** pattern to compose state tax calculators into the general ``TaxEngine``.

Should the need to calculate tax rates for other states arise, all one has to do is 
create a new class implementing ``StateTaxCalculator`` and compose it with the existing ``TaxEngine``.