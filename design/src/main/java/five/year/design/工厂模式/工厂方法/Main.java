package five.year.design.工厂模式.工厂方法;

/**
 * @Date 2022/10/3 14:34
 * @Created by ltc
 */

public class Main {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        IProduct productA = productFactory.createProduct(ProductA.class);
        IProduct productB = productFactory.createProduct(ProductB.class);
        productA.sayName();
        productB.sayName();
    }
}
