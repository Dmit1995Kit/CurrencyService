package com.yakovlev.ServiceCurrency.model.giphyModel.ReadJson;

public class ReadByEndPoint {

    private ReadData data;

    public ReadByEndPoint(ReadData data) {
        this.data = data;
    }

    public ReadByEndPoint() {
    }

    public ReadData getData() {
        return data;
    }

    public void setData(ReadData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ReadByEndPoint{" +
                "data=" + data +
                '}';
    }
}
