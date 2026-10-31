package httpAndApi.task3;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        String response;

        // извлеките метод из запроса
        String method = httpExchange.getRequestMethod();
        switch (method){
            // сформируйте ответ в случае, если был вызван POST-метод
            case "POST" ->  {
                // извлеките path из запроса
                String path = httpExchange.getRequestURI().getPath();
                // а из path — профессию и имя
                String[] splitStrings = path.split("/");
                String profession = splitStrings[2];
                String name = splitStrings[3];

                // извлеките заголовок

                Headers headers = httpExchange.getRequestHeaders();
                InputStream inputStream = httpExchange.getRequestBody();
                List<String> wishGoodDay = headers.get("X-Wish-Good-Day");
                try (BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(inputStream, StandardCharsets.UTF_8)
                )){
                    String body = bufferedReader.readLine();
                    if ((wishGoodDay != null) && (wishGoodDay.contains("true"))) {
                        response = body + ", " + profession + " " + name + "! Хорошего дня!";
                    } else {
                        response = body + ", " + profession + " " + name + "!";
                    }
                }
                // соберите ответ
                // не забудьте про ответ для остальных методов
            }
            case "GET" -> response = "Здравствуйте!";
            default -> response = "Некорректный метод!";
        }

        httpExchange.sendResponseHeaders(200, 0);
        try (OutputStream os = httpExchange.getResponseBody()) {
            os.write(response.getBytes());
        }
    }
}