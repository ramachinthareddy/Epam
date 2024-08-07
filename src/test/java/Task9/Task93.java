package Task9;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.function.Supplier;

public class Task93 {
    public static void main(String[] args) {
        // Example usage
        Supplier<LocalTime> getCurrentTimeInEST = () -> LocalTime.now(ZoneId.of("America/New_York"));

        LocalTime currentTimeInEST = getCurrentTimeInEST.get();
        System.out.println(currentTimeInEST); // Output: 09:30:00.123456789
    }
}
