package five.year.design.工厂模式.简单工厂;

import five.year.design.工厂模式.工厂方法.IProduct;

/**
 * @Date 2022/10/3 14:35
 * @Created by ltc
 */

public class SimpleProductFactory {

    public static <T extends IProduct> T createProduct(Class<T> productType) {
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
