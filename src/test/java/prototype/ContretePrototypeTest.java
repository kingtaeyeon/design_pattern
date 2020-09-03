package prototype;

import com.designpattern.prototype.general.ConcretePrototype;
import com.designpattern.singleton.register.ContainerSingleton;

public class ContretePrototypeTest {

    public static void main(String[] args) {

        //创建原型对象
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("Happy");
        System.out.println(prototype);

        //拷贝原型对象
        ConcretePrototype cloneType = prototype.clone();
        System.out.println(cloneType);
    }
}
