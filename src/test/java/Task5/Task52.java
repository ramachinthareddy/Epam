package Task5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;



public class Task52 {
    public static void main(String[] args) {
        Map<Product, Integer> cart = new HashMap<>();
        cart.put(new Product("Product 1", 10.0), 2);
        cart.put(new Product("Product 2", 5.0), 3);
        cart.put(new Product("Product 3", 7.5), 1);

        BiFunction<Map<Product, Integer>, BiFunction<Product, Integer, Double>, Double> calculateCartCost = (cartMap, calculateProductCost) -> {
            double totalCost = 0.0;
            for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
                Product product = entry.getKey();
                int quantity = entry.getValue();
                double productCost = calculateProductCost.apply(product, quantity);
                totalCost += productCost;
            }
            return totalCost;
        };

        BiFunction<Product, Integer, Double> calculateProductCost = (product, quantity) -> product.getPrice() * quantity;

        double cartCost = calculateCartCost.apply(cart, calculateProductCost);
        System.out.println("Cart cost: $" + cartCost);
    }
   static  class Product {
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
}
