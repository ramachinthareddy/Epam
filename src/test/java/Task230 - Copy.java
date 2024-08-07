import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Task230 {

    public static void main(String[] args) {
        // Make API request
        Response response = RestAssured.get("https://api.example.com/endpoint");

        // Check status code and response type
        if (response.statusCode() != 400 && response.contentType().equalsIgnoreCase("application/json")) {
            // Print response body
            System.out.println(response.getBody().asString());
        }
    }
}