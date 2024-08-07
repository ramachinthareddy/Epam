package Task9;
import java.time.LocalDate;
import java.time.Period;

public class Task94 {
    public static int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    public static void main(String[] args) {
        // Example usage
        LocalDate birthDate = LocalDate.of(1990, 5, 15);
        int age = calculateAge(birthDate);
        System.out.println("Age: " + age);
    }

}
