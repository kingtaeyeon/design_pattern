package proxy;

import com.designpattern.proxy.jdkproxy.JdkMeipo;
import com.designpattern.proxy.jdkproxy.ZhaoLiu;
import com.designpattern.proxy.staticproxy.IPerson;
import com.designpattern.proxy.staticproxy.ZhangSan;

public class JdkProxyTest { 

    public static void main(String[] args) {
        JdkMeipo meipo = new JdkMeipo();
        IPerson zhangsan = meipo.getInstance(new ZhangSan());
        zhangsan.findLove();

        IPerson zhaoliu = meipo.getInstance(new ZhaoLiu());
        zhaoliu.findLove();
    }
}
