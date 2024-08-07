package Task9;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Supplier;

public class Task92 {
    public static void main(String[] args) {
        // Example usage
        Supplier<LocalDate> getNextThursday = () -> {
            LocalDate today = LocalDate.now();
            LocalDate nextThursday = today;
            do {
                nextThursday = nextThursday.plusDays(1);
            } while (nextThursday.getDayOfWeek() != DayOfWeek.THURSDAY);
            return nextThursday;
        };

        LocalDate nextThursdayDate = getNextThursday.get();
        System.out.println(nextThursdayDate); // Output: 2022-01-27
    }
}
