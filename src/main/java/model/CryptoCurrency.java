package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CryptoCurrency {

    @JsonProperty
    private String id;
    @JsonProperty
    private String status;
    @JsonProperty
    private String price;
    @JsonProperty
    private String price_date;
    @JsonProperty
    private String price_timestamp;
    @JsonProperty
    private String symbol;
    @JsonProperty
    private String circulating_supply;
    @JsonProperty
    private String max_supply;
    @JsonProperty
    private String name;
    @JsonProperty
    private String logo_url;
    @JsonProperty
    private String market_cap;
    @JsonProperty
    private String transparent__market_cap;
    @JsonProperty
    private String num_exchanges;
    @JsonProperty
    private String num_pairs;
    @JsonProperty
    private String num_pairs_unmapped;
    @JsonProperty
    private String first_candle;
    @JsonProperty
    private String first_trade;
    @JsonProperty
    private String first_order_book;
    @JsonProperty
    private String first_priced_at;
    @JsonProperty
    private String rank;
    @JsonProperty
    private String rank_delta;
    @JsonProperty
    private String high;
    @JsonProperty
    private String high_timestamp;
    @JsonProperty
    private Interval interval;

    public CryptoCurrency(String jsonString) {
        this.price = jsonString.substring(181, 195);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice_date() {
        return price_date;
    }

    public void setPrice_date(String price_date) {
        this.price_date = price_date;
    }

    public String getPrice_timestamp() {
        return price_timestamp;
    }

    public void setPrice_timestamp(String price_timestamp) {
        this.price_timestamp = price_timestamp;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCirculating_supply() {
        return circulating_supply;
    }

    public void setCirculating_supply(String circulating_supply) {
        this.circulating_supply = circulating_supply;
    }

    public String getMax_supply() {
        return max_supply;
    }

    public void setMax_supply(String max_supply) {
        this.max_supply = max_supply;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public void setLogo_url(String logo_url) {
        this.logo_url = logo_url;
    }

    public String getMarket_cap() {
        return market_cap;
    }

    public void setMarket_cap(String market_cap) {
        this.market_cap = market_cap;
    }

    public String getTransparent__market_cap() {
        return transparent__market_cap;
    }

    public void setTransparent__market_cap(String transparent__market_cap) {
        this.transparent__market_cap = transparent__market_cap;
    }

    public String getNum_exchanges() {
        return num_exchanges;
    }

    public void setNum_exchanges(String num_exchanges) {
        this.num_exchanges = num_exchanges;
    }

    public String getNum_pairs() {
        return num_pairs;
    }

    public void setNum_pairs(String num_pairs) {
        this.num_pairs = num_pairs;
    }

    public String getNum_pairs_unmapped() {
        return num_pairs_unmapped;
    }

    public void setNum_pairs_unmapped(String num_pairs_unmapped) {
        this.num_pairs_unmapped = num_pairs_unmapped;
    }

    public String getFirst_candle() {
        return first_candle;
    }

    public void setFirst_candle(String first_candle) {
        this.first_candle = first_candle;
    }

    public String getFirst_trade() {
        return first_trade;
    }

    public void setFirst_trade(String first_trade) {
        this.first_trade = first_trade;
    }

    public String getFirst_order_book() {
        return first_order_book;
    }

    public void setFirst_order_book(String first_order_book) {
        this.first_order_book = first_order_book;
    }

    public String getFirst_priced_at() {
        return first_priced_at;
    }

    public void setFirst_priced_at(String first_priced_at) {
        this.first_priced_at = first_priced_at;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank_delta() {
        return rank_delta;
    }

    public void setRank_delta(String rank_delta) {
        this.rank_delta = rank_delta;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getHigh_timestamp() {
        return high_timestamp;
    }

    public void setHigh_timestamp(String high_timestamp) {
        this.high_timestamp = high_timestamp;
    }

    public Interval getInterval() {
        return interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }
}
