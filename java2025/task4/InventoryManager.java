package task4;

public class InventoryManager {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product p1 = new Product("A101", "Молоко", 50);
        Product p2 = new Product("A102", "Хліб", 120);
        Product p3 = new Product("B205", "Яблуки", 200);
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);
        inventory.printInventory();
        String codeToFind = "A102";
        Product foundProduct = inventory.findProduct(codeToFind);
        if (foundProduct != null) {
            System.out.println("Знайдено товар по коду '" + codeToFind + "': " + foundProduct);
        } else {
            System.out.println("Товар з кодом '" + codeToFind + "' не знайдено.");
        }
        String codeToRemove = "A101";
        inventory.removeProduct(codeToRemove);
        inventory.printInventory();
    }
}