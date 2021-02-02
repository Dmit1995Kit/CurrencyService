package com.yakovlev.ServiceCurrency.model.giphyModel;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class DataBroke {
    @JsonIgnore
    private String type;

    private String id;
    @JsonIgnore
    private String slug;

    private String url;

    private String bitly_url;

    private String embed_url;
    @JsonIgnore
    private String username;

    private String source;
    @JsonIgnore
    private String rating;

    private String content_url;
    @JsonIgnore
    private String source_tld;

    private String source_post_url;
    @JsonIgnore
    private String update_datetime;
    @JsonIgnore
    private String create_datetime;
    @JsonIgnore
    private String import_datetime;
    @JsonIgnore
    private String trending_datetime;

    private ImagesBroke images;
    @JsonIgnore
    private String title;

    public DataBroke(String type, String id, String slug, String url, String bitly_url, String embed_url, String username, String source, String rating, String content_url, String source_tld, String source_post_url, String update_datetime, String create_datetime, String import_datetime, String trending_datetime, ImagesBroke images, String title) {
        this.type = type;
        this.id = id;
        this.slug = slug;
        this.url = url;
        this.bitly_url = bitly_url;
        this.embed_url = embed_url;
        this.username = username;
        this.source = source;
        this.rating = rating;
        this.content_url = content_url;
        this.source_tld = source_tld;
        this.source_post_url = source_post_url;
        this.update_datetime = update_datetime;
        this.create_datetime = create_datetime;
        this.import_datetime = import_datetime;
        this.trending_datetime = trending_datetime;
        this.images = images;
        this.title = title;
    }

    public DataBroke() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getContent_url() {
        return content_url;
    }

    public void setContent_url(String content_url) {
        this.content_url = content_url;
    }

    public String getSource_tld() {
        return source_tld;
    }

    public void setSource_tld(String source_tld) {
        this.source_tld = source_tld;
    }

    public String getSource_post_url() {
        return source_post_url;
    }

    public void setSource_post_url(String source_post_url) {
        this.source_post_url = source_post_url;
    }

    public String getUpdate_datetime() {
        return update_datetime;
    }

    public void setUpdate_datetime(String update_datetime) {
        this.update_datetime = update_datetime;
    }

    public String getCreate_datetime() {
        return create_datetime;
    }

    public void setCreate_datetime(String create_datetime) {
        this.create_datetime = create_datetime;
    }

    public String getImport_datetime() {
        return import_datetime;
    }

    public void setImport_datetime(String import_datetime) {
        this.import_datetime = import_datetime;
    }

    public String getTrending_datetime() {
        return trending_datetime;
    }

    public void setTrending_datetime(String trending_datetime) {
        this.trending_datetime = trending_datetime;
    }

    public ImagesBroke getImages() {
        return images;
    }

    public void setImages(ImagesBroke images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Data{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", slug='" + slug + '\'' +
                ", url='" + url + '\'' +
                ", bitly_url='" + bitly_url + '\'' +
                ", embed_url='" + embed_url + '\'' +
                ", username='" + username + '\'' +
                ", source='" + source + '\'' +
                ", rating='" + rating + '\'' +
                ", content_url='" + content_url + '\'' +
                ", source_tld='" + source_tld + '\'' +
                ", source_post_url='" + source_post_url + '\'' +
                ", update_datetime='" + update_datetime + '\'' +
                ", create_datetime='" + create_datetime + '\'' +
                ", import_datetime='" + import_datetime + '\'' +
                ", trending_datetime='" + trending_datetime + '\'' +
                ", images=" + images +
                ", title='" + title + '\'' +
                '}';
    }
}
