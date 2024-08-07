package Task6;

import java.util.function.IntConsumer;

public class Task62 {

    public static void main(String[] args) {
        IntConsumer squarePrinter = new IntConsumer() {
            @Override
            public void accept(int number) {
                int square = number * number;
                System.out.println("The square of " + number + " is: " + square);
            }
        };

        // Print the square of a number
        int number = 5;
        squarePrinter.accept(number);

        // Print the square of another number
        number = 8;
        squarePrinter.accept(number);
    }
}