import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Task28 {

    public static void main(String[] args) {
        Response response = RestAssured.get("https://mysite.com/posts");

        if (response.getStatusCode() == 400 && response.getContentType().equalsIgnoreCase("application/json")) {
            System.out.println("Response Body: " + response.getBody().asString());
        }
    }
}
