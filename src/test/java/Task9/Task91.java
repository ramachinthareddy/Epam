package Task9;
import java.time.LocalDate;
import java.util.function.Predicate;



    public class Task91 {
        public static void main(String[] args) {
            // Example usage
            LocalDate today = LocalDate.now();
            LocalDate yesterday = today.minusDays(1);

            Predicate<LocalDate> isYesterday = date -> date.equals(yesterday);

            LocalDate date1 = LocalDate.of(2022, 1, 1);
            LocalDate date2 = LocalDate.of(2022, 1, 2);

            System.out.println(isYesterday.test(date1)); // false
            System.out.println(isYesterday.test(date2)); // true
        }
    }

