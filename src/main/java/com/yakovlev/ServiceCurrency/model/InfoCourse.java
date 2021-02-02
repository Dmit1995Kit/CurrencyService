package com.yakovlev.ServiceCurrency.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.math.BigDecimal;

public class InfoCourse{

    private String disclaimer;
    private String license;
    private BigDecimal timestamp;
    private String base;

    private Rates rates;

    public InfoCourse() {
    }

    public InfoCourse( String disclaimer, String license, BigDecimal timestamp, String base, Rates rates) {

        this.disclaimer = disclaimer;
        this.license = license;
        this.timestamp = timestamp;
        this.base = base;
        this.rates = rates;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public BigDecimal getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }


    @Override
    public String toString() {
        return "InfoCourse{" +
                ", disclaimer='" + disclaimer + '\'' +
                ", license='" + license + '\'' +
                ", timestamp=" + timestamp +
                ", base='" + base + '\'' +
                ", rates=" + rates +
                '}';
    }
}
