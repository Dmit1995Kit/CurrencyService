package com.yakovlev.ServiceCurrency.ClientFeign;

import com.yakovlev.ServiceCurrency.domain.InfoCourseDB;
import com.yakovlev.ServiceCurrency.model.InfoCourse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="openexchangerates", url = "${feign.client.url}")
public interface ExchangeRates {

    @RequestMapping(method = RequestMethod.GET)
    InfoCourse getExchange();
}
