package ru.mirea.sukhanovmd.finnewsapp.data.model;

public class CurrencyRate {
    private String currency1;
    private double rate1;
    private String currency2;
    private double rate2;

    public CurrencyRate(String currency1, double rate1, String currency2, double rate2) {
        this.currency1 = currency1;
        this.rate1 = rate1;
        this.currency2 = currency2;
        this.rate2 = rate2;
    }

    public String getCurrency1() {
        return currency1;
    }

    public double getRate1() {
        return rate1;
    }

    public String getCurrency2() {
        return currency2;
    }

    public double getRate2() {
        return rate2;
    }
}