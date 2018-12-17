package piggybank;

import java.time.LocalDate;

public class CashCard extends Cash {

    private String name;
    private LocalDate expiredDate;

    public CashCard(double value, String name, LocalDate expiredDate) {
        super(value);
        this.name = name;
        this.expiredDate = expiredDate;
    }
    @Override
    public double getValue() {
        if (expired())
            return 0;
        return super.getValue();
    }

    private boolean expired() {
        LocalDate now = LocalDate.now();
        return expiredDate.isBefore(now);
    }

    public String toString() {
        return "[" + name + " Card] = " + getValue();
    }
}
