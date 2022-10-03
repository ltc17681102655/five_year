package five.year.design.原型模式;

/**
 * @Date 2022/10/3 13:52
 * @Created by ltc
 */

public class ProtoTypeClass implements Cloneable {

    public ProtoTypeClass() {
        System.out.println("执行:ProtoTypeClass:构造方法");
    }

    private String name;
    private Integer age;

    @Override
    public ProtoTypeClass clone() {
        ProtoTypeClass cloneObject = null;
        try {
            cloneObject = (ProtoTypeClass) super.clone();
        } catch (Exception e) {
            // TODO: handle exception
        }
        return cloneObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ProtoTypeClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}