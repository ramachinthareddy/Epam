package Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;



public class Task44 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Product 1", 500.0, "Category 1", "Standard"));
        productList.add(new Product("Product 2", 3500.0, "Category 2", "Premium"));
        productList.add(new Product("Product 3", 2000.0, "Category 3", "Premium"));

        Consumer<Product> updateNameConsumer = (product) -> {
            if (product.getPrice() > 3000.0) {
                product.setName(product.getName() + "*");
            }
        };

        productList.forEach(updateNameConsumer);

        productList.stream()
                .filter(product -> product.getGrade().equals("Premium"))
                .forEach(product -> {
                    System.out.println("Name: " + product.getName());
                    System.out.println("Price: " + product.getPrice());
                    System.out.println("Category: " + product.getCategory());
                    System.out.println("Grade: " + product.getGrade());
                    System.out.println();
                });
    }
  static   class Product {
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

        public void setName(String name) {
            this.name = name;
        }
    }
}
