class ImageProcessor {
    private ImageFilter filter;

    public void setFilter(ImageFilter filter) {
        this.filter = filter;
    }

    public void processImage(String imageName) {
        filter.apply(imageName);
    }
}