package Bughalter;

import java.math.BigDecimal;

public class VATaxType extends TaxType{
    private final BigDecimal taxRate = BigDecimal.valueOf(0.18);
    public BigDecimal calculateTaxFor(BigDecimal amount ) {
        return amount.multiply(taxRate);
    }
}
