import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {

    public Moedas buscaMoeda(String moeda){
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/c229ee1a41a8ecd197c6bd5e/latest/" + moeda);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            JsonObject jsonResponse = new Gson().fromJson(response.body(), JsonObject.class);
            JsonObject conversionRates = jsonResponse.getAsJsonObject("conversion_rates");

            Moedas moedas = new Gson().fromJson(conversionRates, Moedas.class);
            return moedas;
        } catch (Exception e){
            throw new RuntimeException("Não consegui obter a moeda a partir da moeda informada.");
        }
    }
}
