package Task4;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;



public class Task45 {
    public static void main(String[] args) {
        Supplier<Product> randomProductSupplier = () -> {
            List<String> names = Arrays.asList("Product 1", "Product 2", "Product 3");
            List<String> categories = Arrays.asList("Category 1", "Category 2", "Category 3");
            List<String> grades = Arrays.asList("Standard", "Premium");

            Random random = new Random();
            String name = names.get(random.nextInt(names.size()));
            double price = random.nextDouble() * 1000.0;
            String category = categories.get(random.nextInt(categories.size()));
            String grade = grades.get(random.nextInt(grades.size()));

            return new Product(name, price, category, grade);
        };

        Product randomProduct = randomProductSupplier.get();
        System.out.println("Random Product:");
        System.out.println("Name: " + randomProduct.getName());
        System.out.println("Price: " + randomProduct.getPrice());
        System.out.println("Category: " + randomProduct.getCategory());
        System.out.println("Grade: " + randomProduct.getGrade());
    }
   static class Product {
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
}
