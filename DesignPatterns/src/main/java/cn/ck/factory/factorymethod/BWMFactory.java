package cn.ck.factory.factorymethod;

/**
 * ������
 */
public class BWMFactory extends AbstractFactory {
    @Override
    public Car createCar() {
        return new BWM();
    }
}
