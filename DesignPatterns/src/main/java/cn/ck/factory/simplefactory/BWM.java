package cn.ck.factory.simplefactory;

/**
 * 定义一个宝马类
 */
public class BWM implements Car {
    @Override
    public void run() {
        System.out.println("宝马正在running...");
    }
}
