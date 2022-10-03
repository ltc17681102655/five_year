package five.year.design.工厂模式.抽象工厂;

/**
 * @Date 2022/10/3 14:38
 * @Created by ltc
 */

public class RedProductFactory extends AbstractProductFactory {

    @Override
    public IProduct createProductA() {
        return new RedProductA();
    }

    @Override
    public IProduct createProductB() {
        return new RedProductB();
    }
}

