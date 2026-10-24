package httpAndApi;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

public class DayHandler implements HttpHandler  {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        System.out.println("Началась обработка /day запроса от клиента.");
        Random random = new Random();

        String[] days = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        String response = days[random.nextInt(days.length)];
        exchange.sendResponseHeaders(200, 0);

        try (OutputStream os = exchange.getResponseBody()) {
            os.write(response.getBytes());
        }


    }
}
