import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;


public class PriceController {
    private final String apiKey = "dbd4ee131c335eb17afc99181b1a6899";
    private static final String BASE_API_URL = "https://api.nomics.com/v1/currencies/ticker?key=";
    private final RestTemplate restTemplate = new RestTemplate();


    public String retrieveBitcoinPrice(String symbol) {
        String cryptoPrice = "";
        String cryptoCurr = "";
        String API_SUFFIX_URL = "&ids=" + symbol + "&interval=1d";
        try {
            cryptoCurr = restTemplate.exchange(BASE_API_URL + apiKey + API_SUFFIX_URL, HttpMethod.GET, makeEntity(), String.class).getBody();
            JSONArray jsonArray = (JSONArray) new JSONParser().parse(cryptoCurr);
            JSONObject jsonObject = (JSONObject) jsonArray.get(0);
            cryptoPrice = jsonObject.get("price").toString();
        }
        catch(Exception e) {
            cryptoPrice = "enter a valid cryptocurrency symbol";
            System.out.println(e.getMessage());
        }
        return cryptoPrice;
    }
    public HttpEntity makeEntity() {
        HttpHeaders headers = new HttpHeaders();
        return new HttpEntity<>(headers);

    }

    
}
