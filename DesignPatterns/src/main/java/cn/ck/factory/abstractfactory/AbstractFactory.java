package cn.ck.factory.abstractfactory;

/**
 *抽象工厂模式，定义一个抽象工厂，里面有生成产品族（一系列相关产品）的方法。
 * 工厂方法有力于产品族的增加，增加一系列的产品，也是新增一个工厂继承该抽象工厂（不过该工厂有多个生成方法）
 * 抽象工厂要确定好产品族，不要修改产品族的产品，修改产品族的产品，抽象工厂跟具体工厂都要修改相应的产品，
 *
 */
public abstract class  AbstractFactory {
    //生产car的抽象方法
    public abstract Car createCar();
    //生成wheel的抽象方法
    public abstract  Wheel createWheel();
}
