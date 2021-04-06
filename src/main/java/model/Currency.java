package model;

public class Currency {

    private String symbol;
    private String status;
    private String price;
    private String name;
    private String rank;
    private String high;
    private String highTimestamp;
    private Interval oneDayInterval;
    private Interval thirtyDayInterval;

    public Interval getThirtyDayInterval() {
        return thirtyDayInterval;
    }

    public void setThirtyDayInterval(Interval thirtyDayInterval) {
        this.thirtyDayInterval = thirtyDayInterval;
    }

    public Interval getOneDayInterval() {
        return oneDayInterval;
    }

    public void setOneDayInterval(Interval oneDayInterval) {
        this.oneDayInterval = oneDayInterval;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getHighTimestamp() {
        return highTimestamp;
    }

    public void setHighTimestamp(String highTimestamp) {
        this.highTimestamp = highTimestamp;
    }
}
