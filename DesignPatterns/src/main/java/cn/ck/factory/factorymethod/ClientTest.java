package cn.ck.factory.factorymethod;

/**
 * 工厂方法客户端测试类
 */
public class ClientTest {
    public static void main(String[] args) {
        //创建奔驰工厂
        AbstractFactory benZFactory=new BenZFactory();
        //创建宝马工厂
        AbstractFactory bWMFactory=new BenZFactory();
        //生产一辆奔驰
        Car benZ= benZFactory.createCar();
        //生产一辆宝马
        Car bWM=bWMFactory.createCar();
        benZ.run();
        bWM.run();


    }
}
