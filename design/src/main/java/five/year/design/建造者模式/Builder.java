package five.year.design.建造者模式;

/**
 * @Date 2022/10/3 14:57
 * @Created by ltc
 */

public abstract class Builder {

    protected Person person = new Person();

    public abstract void buildHead();

    public abstract void buildArm();

    public abstract void buildLeg();

    public abstract void buildBody();

    public abstract Person getPerson();
}