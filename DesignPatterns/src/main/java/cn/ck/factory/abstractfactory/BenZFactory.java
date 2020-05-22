package cn.ck.factory.abstractfactory;

/**
 * 奔驰工厂继承抽象工厂
 */
public class BenZFactory extends AbstractFactory {
    @Override
    public Car createCar() {
        return new BenZ();
    }

    @Override
    public Wheel createWheel() {
        return new BenZWheel();
    }
}
