package com.yakovlev.ServiceCurrency.ClientFeign;

import com.yakovlev.ServiceCurrency.model.giphyModel.ByIdEndPointBroke;
import org.springframework.stereotype.Component;

@Component
public class GiphyBeanBroke implements ExchangeGiphyBroke {
    @Override
    public ByIdEndPointBroke clientGiphyBroke() {
        return null;
    }
}
