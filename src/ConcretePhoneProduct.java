package src;

public class ConcretePhoneProduct implements IProduct{
    private String marca;
    private String os;

    public ConcretePhoneProduct(String marca, String os) {
        this.marca = marca;
        this.os = os;
    }

    public String getProductInfo() {
        return "Celular\n\n Marca: " + marca + ", Sistema operativo: " + os;
    }
}
