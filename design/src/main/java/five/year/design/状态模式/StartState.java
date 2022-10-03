package five.year.design.状态模式;

/**
 * @Date 2022/10/3 17:25
 * @Created by ltc
 */

public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}
