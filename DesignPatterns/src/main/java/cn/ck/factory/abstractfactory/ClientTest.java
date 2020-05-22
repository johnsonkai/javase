package cn.ck.factory.abstractfactory;

/**
 * 抽象工厂客户端测试类
 */
public class ClientTest {
    public static void main(String[] args) {
        //创建奔驰工厂
        AbstractFactory benZFactory=new BenZFactory();
        //创建宝马工厂
        AbstractFactory bWMFactory=new BenZFactory();
        //生产一辆奔驰
        Car benZ= benZFactory.createCar();
        //生成奔驰轮子
        Wheel benZWheel=benZFactory.createWheel();
        //生产一辆宝马
        Car bWM=bWMFactory.createCar();
        //生成宝马轮子
        Wheel bWMWheel=bWMFactory.createWheel();
        benZ.run();
        benZWheel.functions();
        bWM.run();
        bWMWheel.functions();


    }
}
