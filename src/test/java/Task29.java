import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Task29 {
    public static void main(String[] args) {
        // Make the API request
        Response response = RestAssured.get("https://api.example.com/endpoint");

        // Check if the response has a status code of 400 or a response type of JSON
        if (response.statusCode() == 400 || response.contentType().equalsIgnoreCase("application/json")) {
            // Print the response body
            System.out.println(response.getBody().asString());
        }
    }
}
