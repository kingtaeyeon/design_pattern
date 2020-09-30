package proxy;

import com.designpattern.proxy.general.Proxy;
import com.designpattern.proxy.general.RealSubject;

public class GeneralTest {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
