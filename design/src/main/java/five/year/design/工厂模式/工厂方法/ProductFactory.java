package five.year.design.工厂模式.工厂方法;

/**
 * @Date 2022/10/3 14:34
 * @Created by ltc
 */

public class ProductFactory extends AbstractProductFactory {

    @Override
    public <T extends IProduct> T createProduct(Class<T> productType) {
        // TODO Auto-generated method stub
        IProduct product = null;
        try {
            product = productType.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
