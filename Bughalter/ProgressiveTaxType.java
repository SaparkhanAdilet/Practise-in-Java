package Bughalter;

public class ProgressiveTaxType extends TaxType {
    public double calculateTaxFor(double amount ) {
        if(amount<= 1000_00){
            return ((amount / 100) *10) + amount;
        }else if (amount >1000_00){
            return ((amount/ 100) * 15) + amount;
        }
        return amount;
    }
}
