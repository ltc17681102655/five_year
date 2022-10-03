package five.year.design.访问者模式;


/**
 * @Date 2022/10/3 16:47
 * @Created by ltc
 */

public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
