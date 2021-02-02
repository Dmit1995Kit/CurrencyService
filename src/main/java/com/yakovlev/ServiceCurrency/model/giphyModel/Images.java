package com.yakovlev.ServiceCurrency.model.giphyModel;

public class Images {

      private downsized_large downsized_large;

      private original original;

    public Images(Images.downsized_large downsized_large, Images.original original) {
        this.downsized_large = downsized_large;
        this.original = original;
    }

    public Images() {
    }

    public Images.downsized_large getDownsized_large() {
        return downsized_large;
    }

    public void setDownsized_large(Images.downsized_large downsized_large) {
        this.downsized_large = downsized_large;
    }

    public Images.original getOriginal() {
        return original;
    }

    public void setOriginal(Images.original original) {
        this.original = original;
    }

    @Override
    public String toString() {
        return "Images{" +
                "downsized_large=" + downsized_large +
                ", original=" + original +
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
    public static class original {
        private String frames;
        private String hash;
        private String height;
        private String mp4;
        private String mp4_size;
        private String size;
        private String url;
        private String webp;
        private String webp_size;
        private String width;

        public original(String frames, String hash, String height, String mp4, String mp4_size, String size, String url, String webp, String webp_size, String width) {
            this.frames = frames;
            this.hash = hash;
            this.height = height;
            this.mp4 = mp4;
            this.mp4_size = mp4_size;
            this.size = size;
            this.url = url;
            this.webp = webp;
            this.webp_size = webp_size;
            this.width = width;
        }

        public original() {
        }

        public String getFrames() {
            return frames;
        }

        public void setFrames(String frames) {
            this.frames = frames;
        }

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public String getMp4() {
            return mp4;
        }

        public void setMp4(String mp4) {
            this.mp4 = mp4;
        }

        public String getMp4_size() {
            return mp4_size;
        }

        public void setMp4_size(String mp4_size) {
            this.mp4_size = mp4_size;
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

        public String getWebp() {
            return webp;
        }

        public void setWebp(String webp) {
            this.webp = webp;
        }

        public String getWebp_size() {
            return webp_size;
        }

        public void setWebp_size(String webp_size) {
            this.webp_size = webp_size;
        }

        public String getWidth() {
            return width;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        @Override
        public String toString() {
            return "original{" +
                    "frames='" + frames + '\'' +
                    ", hash='" + hash + '\'' +
                    ", height='" + height + '\'' +
                    ", mp4='" + mp4 + '\'' +
                    ", mp4_size='" + mp4_size + '\'' +
                    ", size='" + size + '\'' +
                    ", url='" + url + '\'' +
                    ", webp='" + webp + '\'' +
                    ", webp_size='" + webp_size + '\'' +
                    ", width='" + width + '\'' +
                    '}';
        }
    }
}
