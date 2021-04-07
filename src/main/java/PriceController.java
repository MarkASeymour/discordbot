import model.Currency;
import model.Interval;
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


    public Currency retrieveCryptoPrice(String symbol) {
        String cryptoPrice = "";
        String cryptoCurr = "";
        String API_SUFFIX_URL = "&ids=" + symbol + "&interval=1d,7d,30d";
        Currency currency = new Currency();
        Interval intervalOneDay = new Interval();
        Interval intervalThirtyDay = new Interval();
        Interval intervalSevenDay = new Interval();
        try {
            // get json object from nomics, store temporarily as local json
            cryptoCurr = restTemplate.exchange(BASE_API_URL + apiKey + API_SUFFIX_URL, HttpMethod.GET, makeEntity(), String.class).getBody();
            JSONArray jsonArray = (JSONArray) new JSONParser().parse(cryptoCurr);
            JSONObject jsonObject = (JSONObject) jsonArray.get(0);
            JSONObject jsonObjectInterval1d = (JSONObject) jsonObject.get("1d");
            JSONObject jsonObjectInterval30d = (JSONObject) jsonObject.get("30d");
            JSONObject jsonObjectInterval7d = (JSONObject) jsonObject.get("7d");
            //set up java currency object from local json
            currency.setPrice(jsonObject.get("price").toString());
            currency.setHigh(jsonObject.get("high").toString());
            currency.setHighTimestamp(jsonObject.get("high_timestamp").toString());
            currency.setName(jsonObject.get("name").toString());
            currency.setRank(jsonObject.get("rank").toString());
            currency.setStatus(jsonObject.get("status").toString());
            currency.setSymbol(jsonObject.get("symbol").toString());
            //set up 1d interval object
            intervalOneDay.setIntervalLength("1d");
            intervalOneDay.setPriceChange(jsonObjectInterval1d.get("price_change").toString());
            intervalOneDay.setPriceChangePct(jsonObjectInterval1d.get("price_change_pct").toString());
            //set up 7d interval object
            intervalSevenDay.setIntervalLength("7d");
            intervalSevenDay.setPriceChange(jsonObjectInterval7d.get("price_change").toString());
            intervalSevenDay.setPriceChangePct(jsonObjectInterval7d.get("price_change_pct").toString());
            //set up 30d interval object
            intervalThirtyDay.setIntervalLength("30d");
            intervalThirtyDay.setPriceChange(jsonObjectInterval30d.get("price_change").toString());
            intervalThirtyDay.setPriceChangePct(jsonObjectInterval30d.get("price_change_pct").toString());
            //store in currency object
            currency.setOneDayInterval(intervalOneDay);
            currency.setSevenDayInterval(intervalSevenDay);
            currency.setThirtyDayInterval(intervalThirtyDay);
        }
        catch(Exception e) {
            currency.setName("Invalid crypto symbol. Enter a valid symbol!");
            System.out.println(e.getMessage());
        }
        return currency;
    }

    public String getExchangeRate(String symbol) {
        String EXCHANGE_URL = "https://api.nomics.com/v1/exchange-rates?key=";
        try {
            String exchangeCurrencies = restTemplate.exchange(EXCHANGE_URL + apiKey, HttpMethod.GET, makeEntity(), String.class).getBody();
            JSONArray jsonArray = (JSONArray) new JSONParser().parse(exchangeCurrencies);

            for(int i = 0; i < jsonArray.size(); i++) {
                JSONObject tempJSONObject = (JSONObject) jsonArray.get(i);
                if(tempJSONObject.get("currency").equals(symbol)) {
                    return tempJSONObject.get("rate").toString();
                }
            }
            return "enter a valid currency symbol";

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return "something went wrong retrieving currencies!";
        }
    }

    public HttpEntity makeEntity() {
        HttpHeaders headers = new HttpHeaders();
        return new HttpEntity<>(headers);

    }

    
}
