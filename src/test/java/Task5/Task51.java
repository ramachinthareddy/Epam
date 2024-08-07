package Task5;

import java.util.function.BiFunction;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Task51 {
    public static void main(String[] args) {
        BiFunction<String, Double, Product> createProduct = (name, price) -> new Product(name, price);

        // Usage example
        String productName = "Example Product";
        double productPrice = 9.99;

        Product product = createProduct.apply(productName, productPrice);
        System.out.println(product);
    }
}
