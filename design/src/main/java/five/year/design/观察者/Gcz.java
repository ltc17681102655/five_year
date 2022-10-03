package five.year.design.观察者;

import java.util.Observable;
import java.util.Observer;

/**
 * @Date 2022/10/3 12:54
 * @Created by ltc
 * 观察者
 */
public class Gcz implements Observer {

    @Override
    public void update(Observable o, Object content) {
        String who = ((Bgcz) o).getName();
        System.out.println("新鲜事:{" + who + "发布了一条微博，内容是：[" + content + "]}");
    }

}
