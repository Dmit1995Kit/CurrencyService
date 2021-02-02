package com.yakovlev.ServiceCurrency.ClientFeign;

import com.yakovlev.ServiceCurrency.model.giphyModel.ByIdEndpoint;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name= "static/giphy", url = "${feign.giphy.rich.url}")
public interface ExchangeGiphyRich {

    @RequestMapping(method = RequestMethod.GET)
    ByIdEndpoint giphyRich();
}
