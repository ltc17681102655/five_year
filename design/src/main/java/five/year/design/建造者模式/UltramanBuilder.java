package five.year.design.建造者模式;

/**
 * @Date 2022/10/3 15:00
 * @Created by ltc
 */

public class UltramanBuilder extends Builder {

    @Override
    public void buildHead() {
        person.getHeads().add("ultraman head");
    }

    @Override
    public void buildArm() {
        person.getArms().add("ultraman arm");
    }

    @Override
    public void buildLeg() {
        person.getLegs().add("ultraman leg");
    }

    @Override
    public void buildBody() {
        person.getBodys().add("ultraman body");
    }

    @Override
    public Person getPerson() {
        return person;
    }
}
