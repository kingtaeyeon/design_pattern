package singleton;

import com.designpattern.singleton.lazy.LazySimpleSingleton;

public class ExectorThread implements Runnable{

    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
