package Bughalter;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType {
    private final BigDecimal taxRate= BigDecimal.valueOf(0.13);

    public BigDecimal calculateTaxFor(BigDecimal amount ) {
        return amount.multiply(taxRate);
    }
}
