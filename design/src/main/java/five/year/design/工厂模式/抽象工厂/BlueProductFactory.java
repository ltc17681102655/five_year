package five.year.design.工厂模式.抽象工厂;

public class BlueProductFactory extends AbstractProductFactory {
    @Override
    public IProduct createProductA() {
        return new BlueProductA();
    }

    @Override
    public IProduct createProductB() {
        return new BlueProductB();
    }
}
