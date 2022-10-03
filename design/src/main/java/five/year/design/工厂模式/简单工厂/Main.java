package five.year.design.工厂模式.简单工厂;

import five.year.design.工厂模式.工厂方法.IProduct;
import five.year.design.工厂模式.工厂方法.ProductA;
import five.year.design.工厂模式.工厂方法.ProductB;

/**
 * @Date 2022/10/3 14:36
 * @Created by ltc
 */

public class Main {
    public static void main(String[] args) {
        IProduct productA = SimpleProductFactory.createProduct(ProductA.class);
        IProduct productB = SimpleProductFactory.createProduct(ProductB.class);
        productA.sayName();
        productB.sayName();
    }
}
