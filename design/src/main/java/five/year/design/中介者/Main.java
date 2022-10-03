package five.year.design.中介者;

/**
 * @Date 2022/10/3 16:16
 * @Created by ltc
 */

public class Main {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
