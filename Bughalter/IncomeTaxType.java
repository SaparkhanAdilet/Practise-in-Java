package Bughalter;

public class IncomeTaxType extends TaxType {
    public double calculateTaxFor(double amount ) {
        return ((amount / 100.0) * 18.0) + amount;
    }
}
