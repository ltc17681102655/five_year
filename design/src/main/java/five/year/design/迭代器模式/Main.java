package five.year.design.迭代器模式;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Date 2022/10/3 13:02
 * @Created by ltc
 */

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("first");
        list.add("second");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
