package five.year.design.工厂模式.抽象工厂;

public abstract class ProductB implements IProduct {
    @Override
    public void sayName() {
        System.out.println("I am productB");
    }
}
