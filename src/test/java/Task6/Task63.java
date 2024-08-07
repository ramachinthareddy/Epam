package Task6;

import java.util.Random;
import java.util.function.IntSupplier;

public class Task63 implements IntSupplier {

    @Override
    public int getAsInt() {
        Random random = new Random();
        return random.nextInt(5000);
    }

    public static void main(String[] args) {
        Task63 randomIntSupplier = new Task63();

        // Generate a random integer below 5000
        int randomNumber = randomIntSupplier.getAsInt();
        System.out.println("Random number below 5000: " + randomNumber);
    }
}
