package network_request.task2;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Practice {
    public static void main(String[] args) {
        String url = "https://www.wttr.in/";
// добавьте отлов и обработку исключений вокруг кода ниже
        try {
        URI uri = URI.create(url);
// создаём запрос
        HttpRequest request = HttpRequest.newBuilder().GET().uri(uri).build();
// создаём HTTP-клиент
        HttpClient client = HttpClient.newHttpClient();
// отправляем запрос

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
// выводим код состояния и тело ответа
            System.out.println("Код состояния: " + response.statusCode());
            System.out.println("Тело ответа: " + response.body());
        } catch (InterruptedException | IOException exception){
            System.out.println(" Во время выполнения запроса возникла ошибка. Проверьте, пожалуйста," +
                    " URL-адрес и повторите попытку. ");
        } catch (IllegalArgumentException e){
            System.out.println("Введённый вами адрес не соответствует формату URL. Попробуйте, пожалуйста, снова.");
        }
    }
}