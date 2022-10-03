package five.year.design.命令模式;

import five.year.design.命令模式.命令.AbstractCommand;

import java.util.LinkedList;
import java.util.List;

/**
 * @Date 2022/10/3 13:39
 * @Created by ltc
 */

public class Invoker {

    private List<AbstractCommand> commandList = new LinkedList<AbstractCommand>();

    public void addCommand(AbstractCommand command) {
        commandList.add(command);
    }

    public void addCommands(LinkedList<AbstractCommand> commands) {
        commandList.addAll(commands);
    }

    public void action() {
        for (AbstractCommand command : commandList) {
            command.execute();
        }
    }

}