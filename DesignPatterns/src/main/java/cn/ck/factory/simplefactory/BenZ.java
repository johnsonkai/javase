package cn.ck.factory.simplefactory;

/**
 * 定义一个奔驰类
 */

public class BenZ implements Car {
    @Override
    public void run() {
        System.out.println("奔驰正在running...");
    }
}
