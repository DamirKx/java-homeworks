package network_request.task3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Practice {
    public static void main(String[] args) throws IOException, InterruptedException {
        int requestStatus = 400;
        URI uri = URI.create("http://httpbin.org/status/" + requestStatus);
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(uri)
                .build();

        HttpClient client = HttpClient.newHttpClient();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            switch (response.statusCode()) {
                case 400 -> System.out.println("В запросе содержится ошибка. Проверьте параметры и повторите запрос.");
                case 404 -> System.out.println("По указанному адресу нет ресурса. Проверьте URL-адрес ресурса и повторите запрос.");
                case 500 -> System.out.println("На стороне сервера произошла непредвиденная ошибка.");
                case 503 -> System.out.println("Сервер временно недоступен. Попробуйте повторить запрос позже.");
                default -> {
                    System.out.println(response.statusCode());
                    System.out.println(response.body());
                }
            };
        } catch (IOException | InterruptedException e) {
            System.out.println("Во время выполнения запроса ресурса по url-адресу: " + uri + " возникла ошибка. " +
                    "Проверьте, пожалуйста, адрес и повторите попытку.");
        }



    }
}

