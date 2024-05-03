package src;

public class ConcreteHpFactory implements IProductFactory {
    public IProduct createProduct(String type) {
        return switch (type) {
            case "phone" -> new ConcretePhoneProduct("HP", "Android");
            case "tablet" -> new ConcreteTabletProduct("HP", "Android");
            case "laptop" -> new ConcreteLaptopProduct("HP", "Windows");
            default -> throw new IllegalArgumentException("Error al crear el producto");
        };
    }
}