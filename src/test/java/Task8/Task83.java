package Task8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Task83 {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product("Laptop", "electronics", 1500));
        productsList.add(new Product("TV", "electronics", 2000));
        productsList.add(new Product("Mobile", "electronics", 800));
        productsList.add(new Product("Shirt", "clothing", 500));
        productsList.add(new Product("Shoes", "footwear", 1200));

        // Get all the products with price > 1000 and from electronics category using Streams
        List<Product> filteredProducts = productsList.stream()
                .filter(product -> product.getCategory().equals("electronics") && product.getPrice() > 1000)
                .collect(Collectors.toList());

        // Change the name of the result list to uppercase
        List<String> uppercaseNames = filteredProducts.stream()
                .map(product -> product.getName().toUpperCase())
                .collect(Collectors.toList());

        // Print the names of the filtered products in uppercase
        System.out.println("Filtered Products:");
        for (String name : uppercaseNames) {
            System.out.println(name);
        }
    }
   static class Product {
        private String name;
        private String category;
        private double price;

        public Product(String name, String category, double price) {
            this.name = name;
            this.category = category;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public String getCategory() {
            return category;
        }

        public double getPrice() {
            return price;
        }
    }
}
