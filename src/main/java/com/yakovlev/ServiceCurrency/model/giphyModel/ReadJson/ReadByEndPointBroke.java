package com.yakovlev.ServiceCurrency.model.giphyModel.ReadJson;

import com.yakovlev.ServiceCurrency.model.giphyModel.Data;
import com.yakovlev.ServiceCurrency.model.giphyModel.DataBroke;

public class ReadByEndPointBroke {

    private DataBroke data;

    public ReadByEndPointBroke(DataBroke data) {
        this.data = data;
    }

    public ReadByEndPointBroke() {
    }

    public DataBroke getData() {
        return data;
    }

    public void setData(DataBroke data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ReadByEndPointBroke{" +
                "data=" + data +
                '}';
    }
}
