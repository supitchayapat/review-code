package piggybank;

public class Stock implements Money {

    private String name;
    private double price;
    private double quantity;

    public Stock(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double getValue() {
        return price * quantity;
    }
    public String toString() {
        return "["+ name +" Stock (price: " + price +
                ", qty: "+quantity+")] = " +
                getValue();
    }
}
