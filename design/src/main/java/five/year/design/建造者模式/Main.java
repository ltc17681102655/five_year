package five.year.design.建造者模式;

/**
 * @Date 2022/10/3 15:01
 * @Created by ltc
 */

public class Main {
    public static void main(String[] args) {
        PersonDirector personDirector = null;
        Person person = null;

        personDirector = new PersonDirector(new HumanBuilder());
        person = personDirector.createPerson();
        System.out.println(person);

        personDirector = new PersonDirector(new UltramanBuilder());
        person = personDirector.createPerson();
        System.out.println(person);
    }
}
