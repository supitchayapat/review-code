package piggybank;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PiggyBankTest {

    @Test
    void testCashOnly() {
        PiggyBank piggyBank = new PiggyBank();
        piggyBank.add(new Cash(200));
        piggyBank.add(new Cash(50));
        assertEquals(250, piggyBank.getTotalValue());
    }

    // .... other tests with only one type ....

    @Test
    void testAllNotExpired() {

        PiggyBank piggyBank = new PiggyBank();

        piggyBank.add(new Cash(200));

        // expired: 31 January 2018
        piggyBank.add(new CashCard(100, "MRT",
                LocalDate.of(2018, 1, 31)));
        piggyBank.add(new CashCard(9, "BTS",
                LocalDate.of(2018, 1, 31)));

        piggyBank.add(new Stock("GMM", 100, 20));

        assertEquals(2309, piggyBank.getTotalValue());
    }

    @Test
    void testAllExpired() {

        PiggyBank piggyBank = new PiggyBank();

        piggyBank.add(new Cash(200));

        // expired: 31 January 2018
        piggyBank.add(new CashCard(100, "MRT",
                LocalDate.of(2018, 1, 31)));

        // expired: 31 January 2017
        piggyBank.add(new CashCard(9, "BTS",
                LocalDate.of(2017, 1, 31)));

        piggyBank.add(new Stock("GMM", 100, 20));

        assertEquals(2300, piggyBank.getTotalValue());
    }
}
