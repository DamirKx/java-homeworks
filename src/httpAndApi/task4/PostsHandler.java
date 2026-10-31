package httpAndApi.task4;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import javax.print.DocFlavor;
import java.io.*;
import java.net.URI;
import java.nio.charset.StandardCharsets;

public class PostsHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // получите информацию об эндпоинте, к которому был запрос
        String headers = exchange.getRequestURI().getPath();
        String method = exchange.getRequestMethod();

        Endpoint endpoint = getEndpoint(headers, method);

        switch (endpoint) {
            case GET_POSTS: {
                writeResponse(exchange, "Получен запрос на получение постов", 200);
                break;
            }
            case GET_COMMENTS: {
                writeResponse(exchange, "Получен запрос на получение комментариев", 200);
                break;
            }
            case POST_COMMENT: {
                writeResponse(exchange, "Получен запрос на добавление комментария", 200);
                break;
            }
            default:
                writeResponse(exchange, "Такого эндпоинта не существует", 404);
        }
    }

    private Endpoint getEndpoint(String requestPath, String requestMethod) {
        // реализуйте этот метод
        // ...
        String[] partsPath = requestPath.split("/");
        if (partsPath.length == 2 && partsPath[1].equals("posts")) {
            if (requestMethod.equals("GET")) {
                return Endpoint.GET_POSTS;
            }
        }

        if (partsPath.length == 4 && partsPath[3].equals("comments")) {
            if (requestMethod.equals("GET")) {
                return Endpoint.GET_COMMENTS;
            } else if (requestMethod.equals("POST")) {
                return Endpoint.POST_COMMENT;
            }
        }

        return Endpoint.UNKNOWN;
    }

    private void writeResponse(HttpExchange exchange,
                               String responseString,
                               int responseCode) throws IOException {
        /* Реализуйте отправку ответа, который содержит responseString в качестве тела ответа
        и responseCode в качестве кода ответа.
        Учтите, что если responseString — пустая строка, то её не нужно передавать в ответе. */
        // ...

        if (responseString.isEmpty()){
            exchange.sendResponseHeaders(responseCode, -1);
        } else {
            byte[] bytes = responseString.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(responseCode, bytes.length);
            try (OutputStream os = exchange.getResponseBody()) {
                os.write(bytes);
            }
        }
    }
}