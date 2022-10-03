package five.year.design.建造者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2022/10/3 14:57
 * @Created by ltc
 */

public class Person {
    private List<String> arms = new ArrayList<String>();
    private List<String> heads = new ArrayList<String>();
    private List<String> legs = new ArrayList<String>();
    private List<String> bodys = new ArrayList<String>();

    public Person() {
        System.out.println("person开始构建......");
    }

    @Override
    public String toString() {
        return "我有" + heads.size() + "个头," + bodys.size() + "个身体," + arms.size() + "个手臂," + legs.size() + "个腿.";
    }

    public List<String> getArms() {
        return arms;
    }

    public void setArms(List<String> arms) {
        this.arms = arms;
    }

    public List<String> getHeads() {
        return heads;
    }

    public void setHeads(List<String> heads) {
        this.heads = heads;
    }

    public List<String> getLegs() {
        return legs;
    }

    public void setLegs(List<String> legs) {
        this.legs = legs;
    }

    public List<String> getBodys() {
        return bodys;
    }

    public void setBodys(List<String> bodys) {
        this.bodys = bodys;
    }
}
