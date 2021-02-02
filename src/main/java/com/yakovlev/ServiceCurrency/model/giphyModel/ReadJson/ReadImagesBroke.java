package com.yakovlev.ServiceCurrency.model.giphyModel.ReadJson;

public class ReadImagesBroke {

    private read_downsized_large read_downsized;

    public ReadImagesBroke(read_downsized_large read_downsized) {
        this.read_downsized = read_downsized;
    }

    public ReadImagesBroke() {
    }

    public read_downsized_large getRead_downsized() {
        return read_downsized;
    }

    public void setRead_downsized(read_downsized_large read_downsized) {
        this.read_downsized = read_downsized;
    }

    @Override
    public String toString() {
        return "ReadImagesBroke{" +
                "read_downsized=" + read_downsized +
                '}';
    }

    public static class read_downsized_large{
        private String height;
        private String size;
        private String url;
        private String width;

        public read_downsized_large(String height, String size, String url, String width) {
            this.height = height;
            this.size = size;
            this.url = url;
            this.width = width;
        }

        public read_downsized_large() {
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
            return "read_downsized_large{" +
                    "height='" + height + '\'' +
                    ", size='" + size + '\'' +
                    ", url='" + url + '\'' +
                    ", width='" + width + '\'' +
                    '}';
        }
    }
}
