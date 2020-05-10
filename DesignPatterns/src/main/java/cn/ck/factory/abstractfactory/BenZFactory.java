package cn.ck.factory.abstractfactory;

/**
 * ���۹����̳г��󹤳�
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
