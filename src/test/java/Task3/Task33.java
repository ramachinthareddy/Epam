package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;



public class Task33 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1000.0, true));
        products.add(new Product("Smartphone", 800.0, true));
        products.add(new Product("Headphones", 100.0, true));
        products.add(new Product("Book", 20.0, false));

        Function<List<Product>, Double> calculateElectronicCost = productList -> {
            double totalCost = 0.0;
            for (Product product : productList) {
                if (product.isElectronic()) {
                    totalCost += product.getPrice();
                }
            }
            return totalCost;
        };

        double electronicCost = calculateElectronicCost.apply(products);
        System.out.println("Total cost of electronic products: $" + electronicCost);
    }
    static class Product {
        private String name;
        private double price;
        private boolean isElectronic;

        public Product(String name, double price, boolean isElectronic) {
            this.name = name;
            this.price = price;
            this.isElectronic = isElectronic;
        }

        public double getPrice() {
            return price;
        }

        public boolean isElectronic() {
            return isElectronic;
        }
    }
}
