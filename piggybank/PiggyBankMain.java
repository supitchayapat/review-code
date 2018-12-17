package piggybank;

import java.time.LocalDate;

public class PiggyBankMain {

    public static void main(String[] args) {
        PiggyBank piggyBank = new PiggyBank();

        piggyBank.add(new Cash(200));

        // expired: 31 January 2018
        piggyBank.add(new CashCard(100, "MRT",
                LocalDate.of(2018, 1, 31)));

        // expired: 31 January 2017
        piggyBank.add(new CashCard(9, "BTS",
                LocalDate.of(2017, 1, 31)));

        piggyBank.add(new Stock("GMM", 100, 20));

        System.out.println(piggyBank);
        System.out.println("Total = "+piggyBank.getTotalValue());
    }
}
