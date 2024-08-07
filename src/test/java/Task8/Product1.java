package Task8;

import java.util.ArrayList;
import java.util.List;

public class Product1 {
    private String name;
    private String category;

    public Product1(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public static void Task84(String[] args) {
        List<Product1> productList = new ArrayList<>();
        productList.add(new Product1("Laptop", "Electronics"));
        productList.add(new Product1("Smartphone", "Electronics"));
        productList.add(new Product1("Shirt", "Clothing"));
        productList.add(new Product1("TV", "Electronics"));
        productList.add(new Product1("Shoes", "Footwear"));

        long electronicCount = productList.stream()
                .filter(product -> product.getCategory().equals("Electronics"))
                .count();

        System.out.println("Count of electronic products: " + electronicCount);
    }

}
