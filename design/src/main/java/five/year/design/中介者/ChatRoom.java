package five.year.design.中介者;

import java.util.Date;

/**
 * @Date 2022/10/3 16:15
 * @Created by ltc
 */

public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
