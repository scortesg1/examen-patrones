package src;

public class ConcreteLaptopProduct implements IProduct {
    private String marca;
    private String os;

    public ConcreteLaptopProduct(String marca, String os) {
        this.marca = marca;
        this.os = os;
    }

    public String getProductInfo() {
        return "Laptop\n\n Marca: " + marca + ", Sistema operativo: " + os;
    }
}
