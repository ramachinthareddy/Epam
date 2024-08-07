package Task4;

import java.util.Random;
import java.util.function.Supplier;

public class Task56 {
    public static void main(String[] args) {
        Supplier<String> otpSupplier = () -> {
            StringBuilder otp = new StringBuilder();
            Random random = new Random();

            for (int i = 0; i < 6; i++) {
                otp.append(random.nextInt(10));
            }

            return otp.toString();
        };

        String randomOTP = otpSupplier.get();
        System.out.println("Random OTP: " + randomOTP);
    }
}