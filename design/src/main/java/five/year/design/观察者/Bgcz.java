package five.year.design.观察者;

import java.util.Observable;

/**
 * @Date 2022/10/3 12:52
 * @Created by ltc
 * 被观察者
 */
public class Bgcz extends Observable {

    //业务逻辑,不通知
    public String getName() {
        return "被观察者";
    }

    //发微博，通知
    public void publishWeibo(String content) {
        System.out.println("我发布1条微博，內容是：[" + content + "]");
        setChanged();
        notifyObservers(content);
    }
}
