package five.year.design.命令模式;

import five.year.design.命令模式.命令.AbstractCommand;
import five.year.design.命令模式.命令.Command1;
import five.year.design.命令模式.命令.Command2;
import five.year.design.命令模式.命令的接收者.Receiver1;
import five.year.design.命令模式.命令的接收者.Receiver2;

/**
 * @Date 2022/10/3 13:39
 * @Created by ltc
 */

public class Main {
    public static void main(String[] args) {
        AbstractCommand command1 = new Command1(new Receiver2());
        AbstractCommand command2 = new Command2(new Receiver1());

        Invoker invoker = new Invoker();
        invoker.addCommand(command1);
        invoker.addCommand(command2);
        invoker.action();
    }
}
