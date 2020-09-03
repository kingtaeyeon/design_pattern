package singleton;

import com.designpattern.singleton.register.ContainerSingleton;

/***
 * 容器式单例测试
 * @Author: LiHao
 * @Since: 2020/9/3 0:23
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {
        Object instance1 = ContainerSingleton.getInstance("com..vip.pattern.singleton.test.Pojo");
        Object instance2 = ContainerSingleton.getInstance("com.gupaoedu.vip.pattern.singleton.test.Pojo");
        System.out.println(instance1 == instance2);
    }
}
