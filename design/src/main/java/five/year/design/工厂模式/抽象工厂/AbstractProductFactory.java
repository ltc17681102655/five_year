package five.year.design.工厂模式.抽象工厂;

/**
 * @Date 2022/10/3 14:38
 * @Created by ltc
 */

public abstract class AbstractProductFactory {
    public abstract IProduct createProductA();

    public abstract IProduct createProductB();
}
