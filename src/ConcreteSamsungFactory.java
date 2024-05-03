package src;

public class ConcreteSamsungFactory implements IProductFactory {
    public IProduct createProduct(String type){
        return switch (type) {
            case "phone" -> new ConcretePhoneProduct("Samsung", "Android");
            case "tablet" -> new ConcreteTabletProduct("Samsung", "Android");
            case "laptop" -> new ConcreteLaptopProduct("Samsung", "Windows");
            default -> throw new IllegalArgumentException("Error al crear el producto");
        };
    }
}