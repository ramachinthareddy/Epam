package Task4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.function.Consumer;

class Product {
    private String name;
    private double price;
    private String category;
    private String grade;

    public Product(String name, double price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
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

    public String getGrade() {
        return grade;
    }
}

public class Task41 {
    public static void main(String[] args) {
        Product product = new Product("Example Product", 9.99, "Electronics", "A");

        Consumer<Product> printConsumer = (p) -> {
            if (args.length > 0 && args[0].equals("file")) {
                logToFile(p);
            } else {
                printToConsole(p);
            }
        };

        printConsumer.accept(product);
    }

    private static void logToFile(Product product) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("product.log", true))) {
            writer.println("Name: " + product.getName());
            writer.println("Price: " + product.getPrice());
            writer.println("Category: " + product.getCategory());
            writer.println("Grade: " + product.getGrade());
            writer.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printToConsole(Product product) {
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Category: " + product.getCategory());
        System.out.println("Grade: " + product.getGrade());
        System.out.println();
    }
}
