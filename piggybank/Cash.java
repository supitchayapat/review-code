package piggybank;

public class Cash implements Money {

    private double value;

    public Cash(double value) {
        this.value = value;
    }

    public void addValue(double amount) {
        value += amount;
    }

    public void spend(double amount) {
        value -= amount;
    }

    @Override
    public double getValue() {
        return value;
    }

    public String toString() {
        return "[Cash] = " + getValue();
    }
}
