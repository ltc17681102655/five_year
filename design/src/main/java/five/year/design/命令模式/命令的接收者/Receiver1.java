package five.year.design.命令模式.命令的接收者;

/**
 * @Date 2022/10/3 13:37
 * @Created by ltc
 */


public class Receiver1 extends AbstractReceiver {
    @Override
    public void doSomething() {
        System.out.println("receiver1 do something");
    }
}
