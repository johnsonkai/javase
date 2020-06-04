package cn.ck.adapter.v2;

/**
 * 适配者类 客户需要这个类的功能，但是不能访问这个类，需要被适配器类适配。
 */
public class Adaptee {
    public void specificMethod(){
        System.out.println("客户端需要的适配者业务");
    }
}
