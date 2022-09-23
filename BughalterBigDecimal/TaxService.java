package Bughalter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxService {
    public void payOut(BigDecimal taxAmount){
        System.out.format("Uplashen nalog v razmere %.2f%n", taxAmount.setScale(3, RoundingMode.CEILING));
    }
}
