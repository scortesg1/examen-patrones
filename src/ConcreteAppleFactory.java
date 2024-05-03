package src;

public class ConcreteAppleFactory implements IProductFactory {
    public IProduct createProduct(String type) {
        return switch (type) {
            case "phone" -> new ConcretePhoneProduct("Apple", "iOS");
            case "tablet" -> new ConcreteTabletProduct("Apple", "iOS");
            case "laptop" -> new ConcreteLaptopProduct("Apple", "MacOS");
            default -> throw new IllegalArgumentException("Error al crear el producto");
        };
    }
}