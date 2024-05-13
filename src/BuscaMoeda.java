import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscaMoeda {

    public Moeda BuscaMoeda(String de, String para, double valor) throws IOException, InterruptedException {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/ec134290bceeb15d596fc4f5/pair/"
                + de + "/" + para + "/" + valor);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return new Gson().fromJson(response.body(), Moeda.class);
    }
}
