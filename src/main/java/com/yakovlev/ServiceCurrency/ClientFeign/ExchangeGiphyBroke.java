package com.yakovlev.ServiceCurrency.ClientFeign;

import com.yakovlev.ServiceCurrency.model.giphyModel.ByIdEndPointBroke;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name= "giphy", url = "${feign.giphy.broke.url}")
public interface ExchangeGiphyBroke {
    @RequestMapping(method = RequestMethod.GET)
    ByIdEndPointBroke clientGiphyBroke();
}
