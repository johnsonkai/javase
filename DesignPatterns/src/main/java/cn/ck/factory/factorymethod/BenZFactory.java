package cn.ck.factory.factorymethod;

/**
 * 奔驰工厂继承抽象工厂
 */
public class BenZFactory extends AbstractFactory {
    @Override
    public Car createCar() {
        return new BenZ();
    }
}
