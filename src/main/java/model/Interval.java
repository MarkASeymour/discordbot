package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Interval {
    @JsonProperty
    private String price_change;
    @JsonProperty
    private String price_change_pct;
    @JsonProperty
    private String volume;
    @JsonProperty
    private String volume_change;
    @JsonProperty
    private String volume_change_pct;
    @JsonProperty
    private String market_cap_change;
    @JsonProperty
    private String market_cap_change_pct;
    @JsonProperty
    private String transparent_market_cap_change;
    @JsonProperty
    private String transparent_market_cap_change_pct;
    @JsonProperty
    private VolumeTransparency[] volume_transparency;

    public String getPrice_change() {
        return price_change;
    }

    public void setPrice_change(String price_change) {
        this.price_change = price_change;
    }

    public String getPrice_change_pct() {
        return price_change_pct;
    }

    public void setPrice_change_pct(String price_change_pct) {
        this.price_change_pct = price_change_pct;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVolume_change() {
        return volume_change;
    }

    public void setVolume_change(String volume_change) {
        this.volume_change = volume_change;
    }

    public String getVolume_change_pct() {
        return volume_change_pct;
    }

    public void setVolume_change_pct(String volume_change_pct) {
        this.volume_change_pct = volume_change_pct;
    }

    public String getMarket_cap_change() {
        return market_cap_change;
    }

    public void setMarket_cap_change(String market_cap_change) {
        this.market_cap_change = market_cap_change;
    }

    public String getMarket_cap_change_pct() {
        return market_cap_change_pct;
    }

    public void setMarket_cap_change_pct(String market_cap_change_pct) {
        this.market_cap_change_pct = market_cap_change_pct;
    }

    public String getTransparent_market_cap_change() {
        return transparent_market_cap_change;
    }

    public void setTransparent_market_cap_change(String transparent_market_cap_change) {
        this.transparent_market_cap_change = transparent_market_cap_change;
    }

    public String getTransparent_market_cap_change_pct() {
        return transparent_market_cap_change_pct;
    }

    public void setTransparent_market_cap_change_pct(String transparent_market_cap_change_pct) {
        this.transparent_market_cap_change_pct = transparent_market_cap_change_pct;
    }

    public VolumeTransparency[] getVolume_transparency() {
        return volume_transparency;
    }

    public void setVolume_transparency(VolumeTransparency[] volume_transparency) {
        this.volume_transparency = volume_transparency;
    }
}
