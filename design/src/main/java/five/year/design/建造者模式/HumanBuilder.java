package five.year.design.建造者模式;

/**
 * @Date 2022/10/3 14:57
 * @Created by ltc
 */

public class HumanBuilder extends Builder {

    @Override
    public void buildHead() {
        person.getHeads().add("human head");
    }

    @Override
    public void buildArm() {
        person.getArms().add("human arm");
    }

    @Override
    public void buildLeg() {
        person.getLegs().add("human leg");
    }

    @Override
    public void buildBody() {
        person.getBodys().add("human body");
    }

    @Override
    public Person getPerson() {
        return person;
    }
}
