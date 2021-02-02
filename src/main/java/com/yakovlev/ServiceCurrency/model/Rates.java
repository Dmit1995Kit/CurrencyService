package com.yakovlev.ServiceCurrency.model;
import com.fasterxml.jackson.annotation.JsonView;

public class Rates {

    @JsonView
    private double RUB;

    @JsonView
    private double EUR;

    @JsonView
    private double ANG;

    @JsonView
    private double ARS;

    @JsonView
    private double AUD;

    public double getRUB() {
        return RUB;
    }

    public void setRUB(double RUB) {
        this.RUB = RUB;
    }

    public double getEUR() {
        return EUR;
    }

    public void setEUR(double EUR) {
        this.EUR = EUR;
    }

    public double getANG() {
        return ANG;
    }

    public void setANG(double ANG) {
        this.ANG = ANG;
    }

    public double getARS() {
        return ARS;
    }

    public void setARS(double ARS) {
        this.ARS = ARS;
    }

    public double getAUD() {
        return AUD;
    }

    public void setAUD(double AUD) {
        this.AUD = AUD;
    }
}
