package piggybank;

import java.util.ArrayList;
import java.util.List;

public class PiggyBank {
    private List<Money> moneyList;

    public PiggyBank() {
        moneyList = new ArrayList<>();
    }

    public void add(Money m) {
        moneyList.add(m);
    }

    public double getTotalValue() {
        double sum = 0;
        for (Money m : moneyList) {
            sum += m.getValue();
        }
        return sum;
    }

    public String toString() {
        String result = "";
        for (Money m : moneyList) {
            result += m.toString() +"\n";
        }
        return result;
    }
}
