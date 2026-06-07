package polymorphism.task2;

import java.math.BigDecimal;

public class Practice {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                // TODO создать платежи с различным типами налогообложения
                new Bill(new BigDecimal(100000), new VATaxType(), taxService),
                new Bill(new BigDecimal(20000), new IncomeTaxType(), taxService),
                new Bill(new BigDecimal(500000), new ProgressiveTaxType(), taxService)
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}