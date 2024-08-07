package Task8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Task82 {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product("Laptop", "electronics"));
        productsList.add(new Product("TV", "electronics"));
        productsList.add(new Product("Mobile", "electronics"));
        productsList.add(new Product("Shirt", "clothing"));
        productsList.add(new Product("Shoes", "footwear"));

        // Get all the products from the electronics category using Streams
        List<Product> electronicsProducts = productsList.stream()
                .filter(product -> product.getCategory().equals("electronics"))
                .collect(Collectors.toList());

        // Print the names of the electronics products
        System.out.println("Electronics Products:");
        for (Product product : electronicsProducts) {
            System.out.println(product.getName());
        }
    }
   static class Product {
        private String name;
        private String category;

        public Product(String name, String category) {
            this.name = name;
            this.category = category;
        }

        public String getName() {
            return name;
        }

        public String getCategory() {
            return category;
        }
    }
}
