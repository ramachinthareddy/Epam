import java.util.List;
import java.util.function.Predicate;

public class Task27 {

    public static void main(String[] args) {
        List<String> responses = List.of("Response 1: JSON", "Response 2: XML", "Response 3: JSON", "Response 4: HTML");

        Predicate<String> isJsonResponse = response -> response.contains("JSON");

        System.out.println("JSON Responses:");
        responses.stream()
                .filter(isJsonResponse)
                .forEach(System.out::println);
    }
}