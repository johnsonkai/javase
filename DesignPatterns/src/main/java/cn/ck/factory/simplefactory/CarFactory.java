package cn.ck.factory.simplefactory;

/**
 * 简单工厂的实例工厂，用成员方法生产对象
 * 简单工厂实现了对象的创建与调用分离，但是生产一个新类型的产品对象，需要新增一个方法，或者增加一个方法的逻辑，不遵循开闭原则。
 */
public class CarFactory {
    //生产奔驰的方法
    public Car createBenZ(){
        return new BenZ();
    }
    //生产宝马的方法
    public Car createBWM(){
        return new BWM();
    }
}
