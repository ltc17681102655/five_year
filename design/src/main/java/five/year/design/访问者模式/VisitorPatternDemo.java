package five.year.design.访问者模式;

/**
 * @Date 2022/10/3 16:53
 * @Created by ltc
 */

public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
