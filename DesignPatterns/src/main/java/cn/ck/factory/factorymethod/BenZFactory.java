package cn.ck.factory.factorymethod;

/**
 * ���۹����̳г��󹤳�
 */
public class BenZFactory extends AbstractFactory {
    @Override
    public Car createCar() {
        return new BenZ();
    }
}
