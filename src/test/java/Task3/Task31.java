package Task3;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}

public class Task31 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", 10.0));
        products.add(new Product("Product 2", 20.0));
        products.add(new Product("Product 3", 30.0));

        Function<List<Product>, Double> calculateTotalCost = productList -> {
            double totalCost = 0.0;

            for (Product product : productList) {
                totalCost += product.getCost();
            }

            return totalCost;
        };

        double totalCost = calculateTotalCost.apply(products);
        System.out.println("Total cost of all products: " + totalCost);
    }
}
