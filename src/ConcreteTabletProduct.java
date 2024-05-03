package src;

public class ConcreteTabletProduct implements IProduct{
    private String marca;
    private String os;

    public ConcreteTabletProduct(String marca, String os) {
        this.marca = marca;
        this.os = os;
    }

    public String getProductInfo() {
        return "Tablet\n\n Marca: " + marca + ", Sistema operativo: " + os;
    }
}
