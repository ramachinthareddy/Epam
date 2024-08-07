package Task8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task81 {
    public static void main(String[] args) {
        // Sample list of products
        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product("Product 1", 500));
        productsList.add(new Product("Product 2", 1500));
        productsList.add(new Product("Product 3", 2000));
        productsList.add(new Product("Product 4", 800));

        // Filter products with price > 1000 using Streams
        List<Product> filteredProducts = productsList.stream()
                .filter(product -> product.getPrice() > 1000)
                .collect(Collectors.toList());

        // Print the filtered products
        filteredProducts.forEach(System.out::println);
    }
}

class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
