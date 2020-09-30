package proxy;

import com.designpattern.proxy.staticproxy.ZhangLaosan;
import com.designpattern.proxy.staticproxy.ZhangSan;

public class StaticProxyTest {

    public static void main(String[] args) {
        ZhangLaosan zhangLaosan = new ZhangLaosan(new ZhangSan());
        zhangLaosan.findLove();
    }

}
