package model;

public class Interval {

    private String intervalLength;
    private String priceChange;
    private String priceChangePct;
    private String trend;

    public String getTrend() {
        return trend;
    }

    public String getIntervalLength() {
        return intervalLength;
    }

    public void setIntervalLength(String intervalLength) {
        this.intervalLength = intervalLength;
    }

    public String getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(String priceChange) {
        if(priceChange.charAt(0) == '-') {
            this.trend = "decreased";
            this.priceChange = priceChange.substring(1);
        }
        else {
            this.trend = "increased";
            this.priceChange = priceChange;
        }

    }

    public String getPriceChangePct() {
        return priceChangePct;
    }

    public void setPriceChangePct(String priceChangePct) {
        this.priceChangePct = priceChangePct;
    }
}
