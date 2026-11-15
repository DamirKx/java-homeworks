package network_request.task4;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class Practice {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create("https://api.apilayer.com/exchangerates_data/latest?base=KZT&symbols=EUR%2CUSD");
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(uri)
                .header("apikey", "iISN69jOgAmSSuWq5GG68tko23CuqMLk")
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Код состояние: " + response.statusCode());
            System.out.println("Ответ: " + response.body());

        } catch (IOException | InterruptedException e) { // обрабатываем ошибки отправки запроса
            System.out.println("Во время выполнения запроса ресурса по url-адресу: '" + uri + "' возникла ошибка.\n" +
                    "Проверьте, пожалуйста, адрес и повторите попытку.");
        }
    }
}
