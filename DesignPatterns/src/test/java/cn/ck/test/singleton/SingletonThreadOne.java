package cn.ck.test.singleton;

import cn.ck.singleton.LazySingleton;

public class SingletonThreadOne extends Thread {
    @Override
    public void run() {
       LazySingleton singleton= LazySingleton.getInstance();
        System.out.println(this.getName()+":"+singleton.toString());
    }
}
