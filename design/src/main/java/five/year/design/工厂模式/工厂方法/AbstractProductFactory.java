package five.year.design.工厂模式.工厂方法;

/**
 * @Date 2022/10/3 14:34
 * @Created by ltc
 */

public abstract class AbstractProductFactory {
    public abstract <T extends IProduct> T createProduct(
            Class<T> productType);
}
