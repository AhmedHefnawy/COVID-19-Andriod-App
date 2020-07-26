package com.hefnawy.covid19;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Country {

    @SerializedName("Country")
    @Expose
    private String country;


    @SerializedName("NewConfirmed")
    @Expose
    private Integer newConfirmed;

    @SerializedName("NewDeaths")
    @Expose
    private Integer newDeaths;

    @SerializedName("NewRecovered")
    @Expose
    private Integer newRecovered;

    @SerializedName("Date")
    @Expose
    private String date;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }





    public Integer getNewConfirmed() {
        return newConfirmed;
    }

    public void setNewConfirmed(Integer newConfirmed) {
        this.newConfirmed = newConfirmed;
    }





    public Integer getNewDeaths() {
        return newDeaths;
    }

    public void setNewDeaths(Integer newDeaths) {
        this.newDeaths = newDeaths;
    }





    public Integer getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(Integer newRecovered) {
        this.newRecovered = newRecovered;
    }





    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
