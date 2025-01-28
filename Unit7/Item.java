public class Item {

    private String name;
    private double price;
    private int quantity;

    public Item(String iName, double iPrice, int iQuantity) {
        iName = name;
        iPrice = price;
        iQuantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice(double newPrice) {
        price = newPrice;
        return price;
    }

    public int updateQuantity(int newQuantity) {
        quantity = newQuantity;
        return quantity;
    }

    public String toString() {
        return ("The item " + name + " has " + quantity + " units at $" + price + "\n");
    }
}