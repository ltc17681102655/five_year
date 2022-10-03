package five.year.design.访问者模式;

/**
 * @Date 2022/10/3 16:47
 * @Created by ltc
 */

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}

