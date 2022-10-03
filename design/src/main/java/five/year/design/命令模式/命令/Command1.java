package five.year.design.命令模式.命令;

import five.year.design.命令模式.命令的接收者.AbstractReceiver;

/**
 * @Date 2022/10/3 13:38
 * @Created by ltc
 */

public class Command1 extends AbstractCommand {
    private AbstractReceiver receiver;

    public Command1(AbstractReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("command1 命令发出");
        receiver.doSomething();
    }
}