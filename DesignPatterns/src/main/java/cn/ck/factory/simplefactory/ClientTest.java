package cn.ck.factory.simplefactory;

/**
 * 简单工厂客户端测试类
 */
public class ClientTest {
    public static void main(String[] args) {
        //创建一个汽车工厂对象
        CarFactory carFactory=new CarFactory();
        //生产一辆奔驰
        Car benZ= carFactory.createBenZ();
        //生产一辆宝马
        Car bWM=carFactory.createBWM();
        benZ.run();
        bWM.run();
        //测试静态工厂
        //生产一辆奔驰
        Car benZ1= carFactory.createBenZ();
        //生产一辆宝马
        Car bWM1=carFactory.createBWM();
        benZ1.run();
        bWM1.run();

    }
}
