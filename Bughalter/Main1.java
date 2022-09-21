package Bughalter;

public class Main1 {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
        new Bill(100_000,new IncomeTaxType(),taxService),
        new Bill(100_000, new VATaxType(), taxService),
        new Bill(200_000, new ProgressiveTaxType(),taxService)

        };
        for (int i = 0; i < payments.length; ++i){
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
