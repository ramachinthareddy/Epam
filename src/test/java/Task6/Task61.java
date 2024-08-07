package Task6;

import java.util.function.IntPredicate;

public class Task61 implements IntPredicate {

    @Override
    public boolean test(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Task61 primeNumberPredicate = new Task61();

        // Test if a number is prime
        int number = 17;
        boolean isPrime = primeNumberPredicate.test(number);
        System.out.println(number + " is prime: " + isPrime);

        // Test if another number is prime
        number = 20;
        isPrime = primeNumberPredicate.test(number);
        System.out.println(number + " is prime: " + isPrime);
    }
}
