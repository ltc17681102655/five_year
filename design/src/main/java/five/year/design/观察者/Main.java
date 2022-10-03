package five.year.design.观察者;

/**
 * @Date 2022/10/3 12:56
 * @Created by ltc
 */

public class Main {
    public static void main(String[] args) {
        Bgcz bgcz = new Bgcz();
        final int FANS_NUM = 10;//我的粉丝可不止这些呢
        for (int i = 0; i < FANS_NUM; i++) {
            bgcz.addObserver(new Gcz());
        }
        bgcz.publishWeibo("中国收复台湾");
    }
}
