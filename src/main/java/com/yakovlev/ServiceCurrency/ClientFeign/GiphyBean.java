package com.yakovlev.ServiceCurrency.ClientFeign;

import com.yakovlev.ServiceCurrency.model.giphyModel.ByIdEndpoint;
import org.springframework.stereotype.Component;

@Component
public class GiphyBean implements ExchangeGiphyRich{
    @Override
    public ByIdEndpoint giphyRich() {
        return null;
    }
}
