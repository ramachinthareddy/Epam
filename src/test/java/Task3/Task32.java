package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class Task32 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", 500));
        products.add(new Product("Product 2", 1500));
        products.add(new Product("Product 3", 2000));
        products.add(new Product("Product 4", 800));

        Function<Product, Double> priceExtractor = Product::getPrice;
        double totalCost = calculateTotalCost(products, priceExtractor, productPrice -> productPrice > 1000);
        System.out.println("Total cost of products with price > 1000/-: " + totalCost);
    }

    public static double calculateTotalCost(List<Product> products, Function<Product, Double> priceExtractor, Function<Double, Boolean> predicate) {
        double totalCost = 0;
        for (Product product : products) {
            double price = priceExtractor.apply(product);
            if (predicate.apply(price)) {
                totalCost += price;
            }
        }
        return totalCost;
    }
     static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

}
