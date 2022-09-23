package Bughalter;

import java.math.BigDecimal;

public class Main1 {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(BigDecimal.valueOf(200_000), new IncomeTaxType(), taxService),
                new Bill(BigDecimal.valueOf(200_000), new ProgressiveTaxType(), taxService),
                new Bill(BigDecimal.valueOf(200_000), new VATaxType(), taxService),
                new Bill(BigDecimal.valueOf(5678), new ProgressiveTaxType(), taxService),

        };
        for (Bill bill : payments)
            bill.payTaxes();
        }
    }

