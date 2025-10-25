package task4;
import java.util.HashMap;
import java.util.Map;


public class Inventory {
    private Map<String, Product> products;
    public Inventory(){
        this.products=new HashMap<>();
    }
    public void addProduct(Product product){
        if(product != null && product.productCode != null){
            products.put(product.productCode, product);
            System.out.println("Додано товар: " + product.name);
        }
        else{
            System.out.println("Не вдалося добавити товар");
        }
    }
    public void removeProduct(String productCode){
        Product removedProduct = products.remove(productCode);
        if(removedProduct != null){
            System.out.println("Видалено: " + removedProduct.name);
        }
        else{
            System.out.println("Немає товару: " + productCode);
        }
    }
    public Product findProduct(String productCode){
        return products.get(productCode);
    }
    public void printInventory(){
        if(products.isEmpty()) {
            System.out.println("Інвентірь порожній");
            return;
        }
        System.out.println("Список товарів: ");
        for(Product product: products.values()){
            System.out.println(product);
        }
    }
}
