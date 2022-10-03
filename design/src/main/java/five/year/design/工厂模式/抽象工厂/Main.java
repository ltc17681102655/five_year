package five.year.design.工厂模式.抽象工厂;

/**
 * @Date 2022/10/3 14:38
 * @Created by ltc
 */

public class Main {
    public static void main(String[] args) {
        RedProductFactory redProductFactory = new RedProductFactory();
        System.out.println("red factory is producing");
        IProduct product1 = redProductFactory.createProductA();
        product1.sayName();
        product1.sayColor();
        IProduct product2 = redProductFactory.createProductB();
        product2.sayName();
        product2.sayColor();

        BlueProductFactory blueProductFactory = new BlueProductFactory();
        System.out.println("blue factory is producing");
        IProduct product3 = blueProductFactory.createProductA();
        product3.sayName();
        product3.sayColor();
        IProduct product4 = blueProductFactory.createProductB();
        product4.sayName();
        product4.sayColor();
    }
}
