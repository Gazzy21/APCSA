public class StoreInventoryTester {
    public static void main(String[] args) {
        Inventory storeInventory = new Inventory();

        storeInventory.addItem(new Item("Apple", 1.00, 10));
        storeInventory.addItem(new Item("Apple", 0.50, 20));
        storeInventory.addItem(new Item("Orange", 0.80, 15));
        storeInventory.addItem(new Item("Grapes", 2.00, 5));
        storeInventory.addItem(new Item("Pineapple", 3.00, 70));
        storeInventory.addItem(new Item("Mango", 1.50, 0));
        storeInventory.addItem(new Item("Peach", 1.20, 8));
        storeInventory.addItem(new Item("Strawberry", 2.50, 10));
        storeInventory.addItem(new Item("Blueberry", 3.50, 6));
        storeInventory.addItem(new Item("Watermelon", 4.00, 4));

        System.out.println(storeInventory.getInventoryList());

        storeInventory.removeItem("Apple");
        storeInventory.removeItem();

        storeInventory.updatePrice("Watermelon", 1.50 * 1.5);

        int largestQuantityIndex = storeInventory.largestQuantityIndex();
        System.out.println("Largest quantity index: " + largestQuantityIndex);

        storeInventory.getInventoryList();
    }
}
