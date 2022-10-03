package five.year.design.建造者模式;

/**
 * @Date 2022/10/3 15:00
 * @Created by ltc
 */

public class PersonDirector {

    private Builder builder;

    public PersonDirector(Builder builder) {
        this.builder = builder;
    }

    public Person createPerson() {
        builder.buildBody();
        builder.buildLeg();
        builder.buildLeg();
        if (builder instanceof HumanBuilder) {
            builder.buildHead();
            builder.buildArm();
        } else if (builder instanceof UltramanBuilder) {
            for (int i = 0; i < 3; i++) {//3 head
                builder.buildHead();
            }
            for (int i = 0; i < 6; i++) {//6 arms
                builder.buildArm();
            }

        }
        return builder.getPerson();
    }
}