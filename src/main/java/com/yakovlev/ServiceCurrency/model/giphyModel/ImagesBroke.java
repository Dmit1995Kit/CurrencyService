package com.yakovlev.ServiceCurrency.model.giphyModel;

public class ImagesBroke {

    private downsized_large downsized_large;


    public ImagesBroke(ImagesBroke.downsized_large downsized_large) {
        this.downsized_large = downsized_large;
    }

    public ImagesBroke() {
    }

    public ImagesBroke.downsized_large getDownsized_large() {
        return downsized_large;
    }

    public void setDownsized_large(ImagesBroke.downsized_large downsized_large) {
        this.downsized_large = downsized_large;
    }

    @Override
    public String toString() {
        return "Images{" +
                "downsized_large=" + downsized_large +
                '}';
    }

    public static class downsized_large {
        private String height;
        private String size;
        private String url;
        private String width;

        public downsized_large(String height, String size, String url, String width) {
            this.height = height;
            this.size = size;
            this.url = url;
            this.width = width;
        }

        public downsized_large() {
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        @Override
        public String toString() {
            return "downsized_large{" +
                    "height='" + height + '\'' +
                    ", size='" + size + '\'' +
                    ", url='" + url + '\'' +
                    ", width='" + width + '\'' +
                    '}';
        }
    }
}
