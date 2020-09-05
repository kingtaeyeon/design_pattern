package prototype;

import com.designpattern.prototype.deep.ConcretePrototype;

import java.util.ArrayList;
import java.util.List;

public class ConCretePrototypeTest {

    public static void main(String[] args) {

        //创建原型对象
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("Happy");
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("java");
        hobbies.add("python");
        prototype.setHobbies(hobbies);
        System.out.println(prototype);


        //拷贝原型对象
        //ConcretePrototype cloneType = prototype.deepClone();
        ConcretePrototype cloneType = prototype.deepCloneHobbies();
        cloneType.getHobbies().add("react");
        System.out.println("原型对象："+prototype);
        System.out.println("克隆对象："+cloneType);
        System.out.println(prototype == cloneType);

        System.out.println("原型对象的爱好："+prototype.getHobbies());
        System.out.println("原型对象的爱好："+cloneType.getHobbies());
    }
}
