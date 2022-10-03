package five.year.design.原型模式;

/**
 * @Date 2022/10/3 13:52
 * @Created by ltc
 */

public class Main {

    public static void main(String[] args) {
        ProtoTypeClass protoTypeClass = new ProtoTypeClass();
        protoTypeClass.setName("it难");
        protoTypeClass.setAge(35);
        System.out.println(protoTypeClass.toString());
        //克隆
        System.out.println(protoTypeClass.clone().toString());
    }

}
