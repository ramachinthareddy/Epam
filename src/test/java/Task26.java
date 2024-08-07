import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class HttpResponse {
    private int statusCode;
    private String body;

    public HttpResponse(int statusCode, String body) {
        this.statusCode = statusCode;
        this.body = body;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Status Code: " + statusCode + ", Body: " + body;
    }
}

public class Task26 {
    public static void main(String[] args) {
        List<HttpResponse> responses = Arrays.asList(
                new HttpResponse(200, "OK"),
                new HttpResponse(400, "Bad Request"),
                new HttpResponse(404, "Not Found"),
                new HttpResponse(400, "Invalid Input"),
                new HttpResponse(500, "Internal Server Error")
        );

        Predicate<HttpResponse> statusCode400 = response -> response.getStatusCode() == 400;

        List<HttpResponse> statusCode400Responses = responses.stream()
                .filter(statusCode400)
                .collect(Collectors.toList());

        statusCode400Responses.forEach(response -> System.out.println(response));
    }
}
