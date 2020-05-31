package cn.ck.observer.v21;


import java.util.Observable;
import java.util.Observer;

/**
 * 汇率变化观察者模式实现客户端类
 */
public class RateClient {
    public static void main(String[] args) {
        //具体观察对像进口公司
        Observer importCompany=new ImportCompany();
        //具体观察者对象出口公司
        Observer exportCompany=new ExportCompany();
        //具体主题角色人民币对象
        RMBRate rmbRate=new RMBRate();
        //增添观察者对象
        rmbRate.addObserver(importCompany);
        rmbRate.addObserver(exportCompany);
        //汇率提升
        rmbRate.change(2);
        //汇率降低
        rmbRate.change(-3);

    }
}
