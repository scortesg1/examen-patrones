package src;

class Main {
    public static void main(String[] args) {
        // Crear las fábricas
        IProductFactory factoryApple = new ConcreteAppleFactory();
        IProductFactory factorySamsung = new ConcreteSamsungFactory();
        IProductFactory factoryHp = new ConcreteHpFactory();

        // Crear productos con las fábricas
        IProduct iPhone12 = factoryApple.createProduct("phone");
        IProduct macBook = factoryApple.createProduct("laptop");
        IProduct ipad6 = factoryApple.createProduct("tablet");

        IProduct tabA9 = factorySamsung.createProduct("tablet");
        IProduct s9 = factorySamsung.createProduct("phone");
        IProduct galaxyBook = factorySamsung.createProduct("laptop");

        IProduct hpBook = factoryHp.createProduct("laptop");
        IProduct hpPhone = factoryHp.createProduct("phone");
        IProduct hpTablet = factoryHp.createProduct("tablet");

        // Productos Samsung
        System.out.println(iPhone12.getProductInfo());
        System.out.println(macBook.getProductInfo());
        System.out.println(ipad6.getProductInfo());

        // Productos Samsung
        System.out.println(tabA9.getProductInfo());
        System.out.println(s9.getProductInfo());
        System.out.println(galaxyBook.getProductInfo());

        // Productos hp
        System.out.println(hpBook.getProductInfo());
        System.out.println(hpPhone.getProductInfo());
        System.out.println(hpTablet.getProductInfo());

    }
}