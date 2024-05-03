import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ImageProcessor processor = new ImageProcessor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el filtro a aplicar:");
        System.out.println("1. Filtro de alto contraste");
        System.out.println("2. Filtro de escala de grises");
        System.out.println("3. Filtro sepia");
        int choice = scanner.nextInt();

        System.out.print("Ingrese el nombre de la imagen: ");
        String imageName = scanner.next();

        switch (choice) {
            case 1:
                processor.setFilter(new HighContrastFilter());
                break;
            case 2:
                processor.setFilter(new GrayscaleFilter());
                break;
            case 3:
                processor.setFilter(new SepiaFilter());
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        processor.processImage(imageName);
    }
}