package task4;
import java.util.HashMap;
import java.util.Map;

public class Product {
    String productCode;
    String name;
    int count;
    public Product(String productCode, String name, int count) {
        this.productCode = productCode;
        this.name = name;
        this.count = count;
    }
    public String toString() {
        return "Продукт [Код: " + productCode + " Назва: " + name + " Кількість: " + count + "]";
    }
}
