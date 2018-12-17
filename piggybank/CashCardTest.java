package piggybank;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashCardTest {

    @Test
    void testNotExpired() {

        // expired: 31 January 2018
        CashCard card = new CashCard(100, "MRT",
                LocalDate.of(2018, 1, 31));
        assertEquals(100, card.getValue());
    }

    @Test
    void testExpired() {

        // expired: 31 January 2017
        CashCard card = new CashCard(100, "MRT",
                LocalDate.of(2017, 1, 31));
        assertEquals(0, card.getValue());
    }
}
