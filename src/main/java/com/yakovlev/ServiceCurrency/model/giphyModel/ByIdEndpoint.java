package com.yakovlev.ServiceCurrency.model.giphyModel;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ByIdEndpoint {

    private Data data;

    public ByIdEndpoint(Data data) {
        this.data = data;
    }

    public ByIdEndpoint() {
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ByIdEndpoint{" +
                "data=" + data +
                '}';
    }
}
