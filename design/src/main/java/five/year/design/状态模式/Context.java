package five.year.design.状态模式;

/**
 * @Date 2022/10/3 17:25
 * @Created by ltc
 */

public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
