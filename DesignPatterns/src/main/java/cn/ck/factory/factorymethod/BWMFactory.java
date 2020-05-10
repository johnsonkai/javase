package cn.ck.factory.factorymethod;

/**
 * ±¦Âí¹¤³§
 */
public class BWMFactory extends AbstractFactory {
    @Override
    public Car createCar() {
        return new BWM();
    }
}
