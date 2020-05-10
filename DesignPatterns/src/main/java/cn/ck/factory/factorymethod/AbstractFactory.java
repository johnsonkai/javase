package cn.ck.factory.factorymethod;

/**
 *工厂方法模式，定义一个抽象工厂，如果需要新增一个类型的产品，新增一个工厂类继承抽象工厂。
 * 工厂方法有力于单一产品新增，增加一个产品，新增一个工厂类，进行产品的新增，遵循了开闭原则。
 *工厂方法是抽象工厂的产品族只有一种类型的产品（只有一个抽象产品）的情况
 */
public abstract class  AbstractFactory {
    //生产car的抽象方法
    public abstract Car createCar();
}
