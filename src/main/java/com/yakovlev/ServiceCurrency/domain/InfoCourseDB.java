package com.yakovlev.ServiceCurrency.domain;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.math.BigDecimal;


public class InfoCourseDB{

    private String disclaimer;
    private String license;
    private BigDecimal timestamp;
    private String base;
    private RatesDB rates;

    public InfoCourseDB() {
    }

    public InfoCourseDB( String disclaimer, String license, BigDecimal timestamp, String base, RatesDB rates) {
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

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public RatesDB getRates() {
        return rates;
    }

    public void setRates(RatesDB rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "InfoCourseDB{" +
                ", disclaimer='" + disclaimer + '\'' +
                ", license='" + license + '\'' +
                ", timestamp=" + timestamp +
                ", base='" + base + '\'' +
                ", rates=" + rates +
                '}';
    }
}

