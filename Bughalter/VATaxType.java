package Bughalter;

public class VATaxType extends TaxType{
    public double calculateTaxFor(double amount ) {
        return ((amount / 100) * 13.0) + amount;
    }
}
