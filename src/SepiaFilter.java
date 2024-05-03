class SepiaFilter implements ImageFilter {
    public void apply(String imageName) {
        System.out.println("Aplicando filtro sepia a la imagen: " + imageName);
    }
}