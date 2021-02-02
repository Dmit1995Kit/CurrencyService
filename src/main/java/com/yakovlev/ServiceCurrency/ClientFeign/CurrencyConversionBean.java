package com.yakovlev.ServiceCurrency.ClientFeign;

import com.yakovlev.ServiceCurrency.ClientFeign.ExchangeRates;
import com.yakovlev.ServiceCurrency.domain.InfoCourseDB;
import com.yakovlev.ServiceCurrency.model.InfoCourse;
import org.springframework.stereotype.Component;

@Component
public class CurrencyConversionBean implements ExchangeRates {
    @Override
    public InfoCourse getExchange() {
        return null;
    }
}
