package com.yakovlev.ServiceCurrency.model.giphyModel;

public class ByIdEndPointBroke {

    private DataBroke data;

    public ByIdEndPointBroke(DataBroke data) {
        this.data = data;
    }

    public ByIdEndPointBroke() {
    }

    public DataBroke getData() {
        return data;
    }

    public void setData(DataBroke data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ByIdEndPointBroke{" +
                "data=" + data +
                '}';
    }
}
