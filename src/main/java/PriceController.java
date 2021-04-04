import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;


public class PriceController {
    private String apiKey = "dbd4ee131c335eb17afc99181b1a6899";
    private static final String BASE_API_URL = "https://api.nomics.com/v1/currencies/ticker?key=";
    private static final String API_SUFFIX_URL = "&ids=BTC&interval=1d";
    private final RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) {

        PriceController priceController = new PriceController();
        try {
            JSONArray jsonArray = (JSONArray) new JSONParser().parse(priceController.retrieveBitcoinPrice());
            JSONObject jsonObject = (JSONObject) jsonArray.get(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public String retrieveBitcoinPrice() {
        String bitCoin = "";
        try {
            bitCoin = restTemplate.exchange(BASE_API_URL + apiKey + API_SUFFIX_URL, HttpMethod.GET, makeEntity(), String.class).getBody();
        }
        catch(RestClientResponseException e) {
            System.out.println(e.getRawStatusCode() + ": " + e.getResponseBodyAsString());
        }
        return bitCoin;
    }
    public HttpEntity makeEntity() {
        HttpHeaders headers = new HttpHeaders();
        return new HttpEntity<>(headers);

    }

    
}
