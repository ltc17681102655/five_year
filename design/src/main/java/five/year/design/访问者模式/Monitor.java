package five.year.design.访问者模式;

/**
 * @Date 2022/10/3 16:48
 * @Created by ltc
 */

public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
