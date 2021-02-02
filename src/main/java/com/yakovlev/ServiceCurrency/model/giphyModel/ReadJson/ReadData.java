package com.yakovlev.ServiceCurrency.model.giphyModel.ReadJson;

public class ReadData {

    private String id;

    private String url;

    private String bitly_url;

    private String embed_url;

    private String content_url;

    private String source;

    private ReadImages images;

    private String source_post_url;


    public ReadData(String id, String url, String bitly_url, String embed_url, String content_url, String source, ReadImages images, String source_post_url) {
        this.id = id;
        this.url = url;
        this.bitly_url = bitly_url;
        this.embed_url = embed_url;
        this.content_url = content_url;
        this.source = source;
        this.images = images;
        this.source_post_url = source_post_url;
    }

    public ReadData() {
    }

    public String getSource_post_url() {
        return source_post_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSource_post_url(String source_post_url) {
        this.source_post_url = source_post_url;
    }

    public ReadImages getImages() {
        return images;
    }

    public String getContent_url() {
        return content_url;
    }

    public void setContent_url(String content_url) {
        this.content_url = content_url;
    }

    public void setImages(ReadImages images) {
        this.images = images;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBitly_url() {
        return bitly_url;
    }

    public void setBitly_url(String bitly_url) {
        this.bitly_url = bitly_url;
    }

    public String getEmbed_url() {
        return embed_url;
    }

    public void setEmbed_url(String embed_url) {
        this.embed_url = embed_url;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "ReadData{" +
                "id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", bitly_url='" + bitly_url + '\'' +
                ", embed_url='" + embed_url + '\'' +
                ", content_url='" + content_url + '\'' +
                ", source='" + source + '\'' +
                ", images=" + images +
                ", source_post_url='" + source_post_url + '\'' +
                '}';
    }
}
