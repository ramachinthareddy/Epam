package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;



public class Task34 {
    public static List<Product> filterProducts(List<Product> products, Function<Product, Boolean> predicate) {
        List<Product> filteredProducts = new ArrayList<>();

        for (Product product : products) {
            if (predicate.apply(product)) {
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500, "electronic"));
        products.add(new Product("Mobile", 800, "electronic"));
        products.add(new Product("TV", 2000, "electronic"));
        products.add(new Product("Book", 20, "stationery"));

        Function<Product, Boolean> expensiveElectronicPredicate = product ->
                product.getPrice() > 1000 && product.getCategory().equals("electronic");

        List<Product> expensiveElectronicProducts = filterProducts(products, expensiveElectronicPredicate);

        System.out.println("Expensive Electronic Products:");
        for (Product product : expensiveElectronicProducts) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
    }
   static class Product {
        private String name;
        private double price;
        private String category;

        public Product(String name, double price, String category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public String getCategory() {
            return category;
        }
    }
}