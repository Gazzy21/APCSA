import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> inStock;

    public Inventory() {
        inStock = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        inStock.add(item);
    }

    public void removeItem(String name) {
        for(int i = 0; i < inStock.size(); i++) {
            if (inStock.get(i).getName() == name) {
                inStock.remove(i);
            }
        }
    }
    
    public void removeItem() {
        for(int i = 0; i < inStock.size(); i++) {
            if(inStock.get(i).getQuantity() <= 0) {
                inStock.remove(i);
            }
        }
    }

    public void updatePrice(String name, double percentChange) {
        for(int i = 0; i < inStock.size(); i++) {
            if (inStock.get(i).getName() == name) {
                inStock.get(i).setPrice(inStock.get(i).getPrice() * (1 + percentChange));
            }
        }
    }

    public int largestQuantityIndex() {
        int largest = 0;
        for(int i = 0; i < inStock.size(); i++) {
            if (inStock.get(i).getQuantity() > largest) {
                largest = i;
            }
        }
        return largest;
    }

    public ArrayList<Item> getInventoryList() {
        for (int i = 0; i < )
    }
}
