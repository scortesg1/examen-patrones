class GrayscaleFilter implements ImageFilter {
    public void apply(String imageName) {
        System.out.println("Aplicando filtro de escala de grises a la imagen: " + imageName);
    }
}