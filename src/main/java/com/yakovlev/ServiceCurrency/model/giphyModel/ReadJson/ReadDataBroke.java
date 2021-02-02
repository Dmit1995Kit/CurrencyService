package com.yakovlev.ServiceCurrency.model.giphyModel.ReadJson;

public class ReadDataBroke {
    private String id;

    private String url;

    private ReadImagesBroke images;

    public ReadDataBroke(String id, String url, ReadImagesBroke images) {
        this.id = id;
        this.url = url;
        this.images = images;
    }

    public ReadDataBroke() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ReadImagesBroke getImages() {
        return images;
    }

    public void setImages(ReadImagesBroke images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "ReadDataBroke{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", images=" + images +
                '}';
    }
}
